import { useState } from "react";
import "./App.css";
import { useEffect } from "react";
import axios from "axios";

function App() {
  const [message, setMessage] = useState("");

  useEffect(() => {
    axios
      .get("http://localhost:8080/MonProjetEAR-war/api/hello", {
        //pour la gestion des cookies/sessions
        withCredentials: true,
      })
      .then((response) => setMessage(response.data))
      .catch((error) =>
        setMessage("Erreur lors de la recuperation des données" + error)
      );
  }, []);

  return (
    <>
      <h1>React + Java EE</h1>
      <p>
        Backend says : <strong>{message}</strong>
      </p>
    </>
  );
}

export default App;
