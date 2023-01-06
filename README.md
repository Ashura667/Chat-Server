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
    https://keep.google.com/u/1/media/v2/1CJW9O3J82GdrSi9TwnH2g7hBYiW6y90i-otFMIdJ_UynEUAHcS_IVpRu3ti6OQ/1-cBSJZhj40mzCOyWHmr3dyjhvx72QiRHezddrkrOwvSH70eg0c3bTXu2jkEFXU0?accept=image%2Fgif%2Cimage%2Fjpeg%2Cimage%2Fjpg%2Cimage%2Fpng%2Cimage%2Fwebp%2Caudio%2Faac&sz=1600![image](https://user-images.githubusercontent.com/116311276/210952867-34349992-d62a-4f7d-89b0-7c3daf135cc6.png)
https://keep.google.com/u/1/media/v2/1Zdn1jG2-HTyW3KwukpHaB1NVgVTy-cgzcmjU_0TnIGtBBTiVffQiVTfgZ9dwUvc/1VO2ikspkGSxRNcG6dsrPflU-uZzBY8cANRdNmToJFN9-oPb-lEGld2gNH_8Ogw?accept=image%2Fgif%2Cimage%2Fjpeg%2Cimage%2Fjpg%2Cimage%2Fpng%2Cimage%2Fwebp%2Caudio%2Faac&sz=1600![image](https://user-images.githubusercontent.com/116311276/210952929-23e6e732-fbe3-4848-82fc-58f866ae42a9.png)
https://keep.google.com/u/1/media/v2/1WdWY-sZvyCcq8Qxw9c_8idpHxAauylunMqCRnA3EUDax4QAQHJyLGBT0ccQBVWI/1GVi9D-wjRD9gs2XBoExBjhWSYk-gbjiF8buB6uTuI6uHtz-b9oYxQpFP34S8twI?accept=image%2Fgif%2Cimage%2Fjpeg%2Cimage%2Fjpg%2Cimage%2Fpng%2Cimage%2Fwebp%2Caudio%2Faac&sz=1600![image](https://user-images.githubusercontent.com/116311276/210952980-75863d5f-c757-4465-a070-585a3a9ed65c.png)

