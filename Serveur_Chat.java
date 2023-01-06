import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Serveur_Chat {
	public ArrayList<PrintWriter> all_clients;
	public ArrayList<String> pseudoArrayList = new ArrayList<>();;

	public static void main(String[] args) {
		new Serveur_Chat().start();
		;
	}

	public void start() {

		this.all_clients = new ArrayList<>();
		try {
			ServerSocket serveur = new ServerSocket(5555);
			while (true) {
				Socket client = serveur.accept();
				PrintWriter clientdata = new PrintWriter(client.getOutputStream());
				this.all_clients.add(clientdata);
				Thread thread = new Thread(new ClientIntercepteur(client, this.pseudoArrayList));
				thread.start();
				clientdata.println("Bienvenue sur le serveur\nPour éviter tout abus, il y'a des règles à respecter les mots suivants seront bannis : \npatate\nsteak\ncornichon\nvente\narme\nmedicament");
				clientdata.flush();

			}
		} catch (IOException e) {
		}
	}

	public void envoyer_msg_all(String message) {
		for (PrintWriter writer : this.all_clients) {
			try {
				writer.println(message);
				writer.flush();
			} catch (Exception ex) {

			}
		}
	}

	public class ClientIntercepteur implements Runnable {
		BufferedReader reader;
		Socket socket;
		public ArrayList<String> pseudoList = new ArrayList<>();

		public ClientIntercepteur(Socket clientSocket, ArrayList<String> liste_pseudo) {
			try {
				this.pseudoList = liste_pseudo;
				socket = clientSocket;
				InputStreamReader isReader = new InputStreamReader(socket.getInputStream());
				reader = new BufferedReader(isReader);
			} catch (Exception ex) {
			}
		}

		public void run() {
			String message;
			ArrayList<String> blacklist =new ArrayList<String>(Arrays.asList("patate\nsteak\ncornichon\nvente\narme\nmedicament".split("\n")));
			
			try {
				while ((message = reader.readLine()) != null) {
					String pattern = "HH.mm";

					Format dateFormat = new SimpleDateFormat(pattern);

					String date = dateFormat.format(new Date());
					if (message.startsWith("Serveur")) {
						if (!message.contains("déconnecter"))

						{
							if (!message.contains("connecté")) 
							{
								this.pseudoList.add(message);

							}
							else {
								envoyer_msg_all(message.replace("Serveur : ", "") + " à "+date);

							}

						}
						
						else {
							this.pseudoList.remove(message.replace("Cet utilisateur vient de se déconnecter : ", ""));
							envoyer_msg_all(message.replace("Serveur : ", "") + " à "+date);


						}
						String x = "Serveur : Liste client : ";

						for (String messageString : this.pseudoList) {
							x = x + "," + messageString.replace("Serveur : ", "");
							envoyer_msg_all(x);

						}
					} else {
						for (String black : blacklist) 
						{
							message = message.replace(black, black.substring(0, 1)+ "*".repeat(black.length()-1));
						}
						envoyer_msg_all(date+ " "+ message);

					}
					// System.out.println(message);
				}
			} catch (Exception ex) {

			}
		}
	}
}
