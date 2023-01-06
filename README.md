 Projet Chat
 Les classes :
 - Serveur_chat : Permet la création du serveur et ainsi que les utilisateurs de se connecter.
- Client_Chat et Client_Login : la classe Client_Login permet à l’utilisateur de se connecter à un serveur en attribuant un nom d’utilisateur, un port et une adresse ip. La classe Client_Chat permet à l’utilisateur de discuter avec les autres utilisateurs
connectés au même serveur.
L'exécution se fait uniquement avec les 2 fichiers suivant : Serveur_chat et Client_login, Client_chat n’est pas une classe à exécuter, elle dépend de Client_login
La réalisation du projet :
Pour réaliser ce projet nous avons utilisé Apache Netbeans qui nous permet de créer une interface graphique le plus facilement possible. Une fois que nous avons déterminé notre interface nous avons exporté notre code de manière à pouvoir le modifier sur Eclipse.
Une fois que l’interface graphique était faite, nous avons procédé à la modification des classes et méthodes afin de pouvoir interagir avec les événements du clavier, de la souris etc, nous avons mis en lien plusieurs interface graphique entre elles notamment pour le client ou nous avons crée 2 fichiers distinct un correspondant au portail de connexion et l’autre correspondant à l’interface de chat. Pour se faire nous devons nous assurer que la client est possible entre le client et le serveur si c’est le cas, alors une nouvelle fenêtre s’ouvrira et le client pourra alors discuter.
Pour avoir la possibilité de discuter avec les autres clients, nous avons dû utiliser du parallélisme (Thread) qui nous permettront par la suite de récupérer tous les clients connectés et d’envoyer un message à tous les clients. Nous avions du aussi utilisé du parallélisme pour l’interface de chat pour que le client reçoive les messages à l’instant que les autres utilisateurs envoient un message.
Nous avons par la suite gérer toutes les exceptions nous permettant d’éviter des crash du serveur ou du côté client, nous avons donc utilisé la plupart du temps des try and catch.
Afin de faciliter l’utilisation de l’application ou l’anonymat, nous avons notamment ajouté une fonctionnalité qui permet à l’utilisateur de se connecter en tant qu’anonyme si l’utilisateur ne fournit aucun nom.
   
 Nous avons essayé d’ajouter d’autant plus des fonctionnalités que l'on peut voir dans d’autres interface de chat notamment :
- L’horodatage des messages.
- La liste des clients clients connectés.
- Un message des clients qui se sont déconnectés ainsi qu’un message quand il se
connecte.
- Un message de bienvenue.
- Des règles à respecter, nous avons essayé de mettre en place un système de mot
banni ou nous avons pris des mots aléatoirement et nous avons modifier le contenu
lors de l'envoi au client.
- Auto-suppression du message une fois qu’il est envoyé.
- Règle de sécurité entre le serveur et le client, il n’y aura pas de faux messages en
envoyant Serveur provenant d’un utilisateur.
- Design noir ou blanc : Le défaut étant le blanc, on peut choisir la couleur du fond
d’écran selon nos préférénces.


  
 Représentation graphique :
 ![unnamed-2](https://user-images.githubusercontent.com/116311276/210953159-f71c32ad-396a-4775-866b-02e7675fe60c.png)

![unnamed-3](https://user-images.githubusercontent.com/116311276/210953145-bdac19d7-84f8-43bd-8d9a-c5aac08c1a45.png)
![unnamed](https://user-images.githubusercontent.com/116311276/210953180-8f49bb2b-c734-4ffb-aeb5-81b46543fa5c.png)

