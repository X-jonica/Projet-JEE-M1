# 🚀 Démarche de mon projet

## 🧩 Étapes principales

### 1. **Création du projet `.ear` en Java EE**  
J'ai créé un projet entreprise multi-modules qui inclut :
- Un module `-ejb` pour gérer la logique métier avec des EJB.
- Un module `-war` pour l'interface web et la gestion des services REST.

### 2. **Connexion entre le module EJB et le module Web**  
J'ai effectué l'injection d’un EJB dans un `Servlet`. Cela permet de valider la communication entre le backend et l'interface en affichant un message simple dans le navigateur (par exemple : "Bonjour eee !!").

### 3. **Mise en place d’une API REST avec JAX-RS**  
J'ai ensuite créé une classe REST (`@Path`) et activé JAX-RS avec une classe `@ApplicationPath`. Cela permet d'accéder facilement à des ressources comme `/api/hello`.

### 4. **Récupération de l’API dans le frontend React**  
Depuis React, j'appelle l'API via `fetch` ou `axios`. Une fois la réponse reçue, je l'affiche dans le frontend pour finaliser l'intégration entre le backend (Java EE) et le frontend (React).

### 5. **Résolution de l’erreur CORS**  
Pour que le backend et le frontend puissent communiquer malgré qu'ils soient sur des ports différents (par exemple, `localhost:8080` pour le backend et `localhost:5173` pour le frontend), j'ai mis en place un filtre CORS dans le module web. Cela permet de gérer les requêtes entre ces deux environnements.

---

### 6. **Configuration d'Apache POI pour la lecture des fichiers Excel**

J'ai configuré Apache POI pour permettre l'importation de données depuis des fichiers Excel dans mon projet.

#### Étapes de configuration :

1. **Téléchargement des fichiers Apache POI**  
   - J'ai téléchargé la dernière version stable de POI depuis le site officiel d'Apache POI : [Apache POI Download](https://poi.apache.org/download.html) et extrait les fichiers `.zip`.

2. **Ajout des fichiers JAR dans le projet**  
   - Dans NetBeans, j'ai ajouté les fichiers JAR nécessaires (comme `poi-5.x.x.jar`, `poi-ooxml-5.x.x.jar`, `poi-ooxml-schemas-5.x.x.jar` et `xmlbeans-5.x.x.jar`) dans un dossier `lib` sous le répertoire `src/main/webapp/WEB-INF`.
   - Ces fichiers ont ensuite été ajoutés comme bibliothèques dans NetBeans pour être utilisés dans le projet.

---

### 7. **Création d’une classe utilitaire pour lire un fichier Excel avec Apache POI**

Une fois Apache POI configuré, j'ai créé une classe utilitaire pour lire les fichiers Excel et traiter les données qu'ils contiennent. Cette classe permet de récupérer les informations depuis un fichier Excel afin de les utiliser dans le projet.

---

### 8. **Utilisation d'Apache POI dans un EJB pour importer des données Excel**

Pour importer les données Excel dans mon application, j'ai intégré l'utilisation de POI directement dans un EJB. Ce dernier permet de lire le fichier Excel et de traiter les informations dans le backend. J'ai utilisé un EJB stateless pour cela, ce qui permet une gestion efficace des ressources sans conserver l'état entre les appels.

---

✅ **Objectif final** : Créer une architecture propre et modulaire entre Java EE pour le backend et React pour le frontend, tout en permettant l'importation de données à partir de fichiers Excel grâce à Apache POI.
