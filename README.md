# 🚀 Démarche de mon projet

## 🧩 Étapes principales

1. **Création du projet `.ear` en Java EE**  
   Mise en place d'un projet entreprise multi-modules avec :
   - Un module `-ejb` pour la logique métier (EJB)
   - Un module `-war` pour l’interface web et les services REST

2. **Connexion entre le module EJB et le module Web**  
   - Injection d’un EJB dans un `Servlet`
   - Affichage d’un message dans le navigateur pour valider la communication (ex. : "Bonjour eee !!")

3. **Mise en place d’une API REST avec JAX-RS**  
   - Création d’une classe REST (`@Path`)
   - Activation de JAX-RS via une classe `@ApplicationPath`
   - Objectif : pouvoir accéder à des ressources comme `/api/hello`

4. **Récupération de l’API dans le frontend React**  
   - Appel de l’API depuis React (via `fetch` ou `axios`)
   - Affichage de la réponse dans le frontend pour finaliser l’intégration backend ⇄ frontend

5. **Résolution de l’erreur CORS**  
   - Mise en place d’un filtre CORS dans le module web pour autoriser les requêtes provenant de l'application React
   - Permet la communication entre deux ports différents (`localhost:8080` pour le backend et `localhost:5173` pour le frontend)

---

✅ **Objectif final** : Avoir une architecture **modulaire, propre et connectée** entre Java EE (backend) et React (frontend).
