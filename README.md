<h1>Création d'un service web soap avec Java</h1>
<h3>Architecture et fonctionnement</h3>
<p>
Le service web est composé d'un client java et d'un serveur soap sous l'environnement netbeans.<br/>
il contient également une base de donnée mysql sur laquelle sont enregistrés les auteurs et l'ensemble des livres qu'ils ont publiés.
</p>
<p>
  Création d'une base donnée <b>webtest</b> sous mysql
</p>
<p>
  Création d'une table <b>autor</b><br/>
  <img src="table_author.PNG" />
</p>
<p>
  Création d'une table <b>book</b><br/>
  <img src="table_book.PNG" />
</p>
<p>
  Arborescence du client et du serveur
  <img src="arborescence_du_projet.PNG" />
</p>
<h3>Exécution du service web</h3>
<p>
  Pour exécuter le projet il faut établir une connexion vers vers la base de donnée <b>webtest</b> voir image ci-dessous
   <img src="creation_connexion.PNG" />
</p>
<p>
  Exécuter <b>clean and build</b> sous le server et ensuite exécuter <b>deploy</b> pour que le service web soit prêt à recevoir les requêtes.
</p>
<p>
  Enfin pour tester le service web exécuter <b>clean and build</b> sous le client et ensuite exécuter <b>Run File</b> sous le fichier 
  <b>Author.java</b> et <b>Book.java</b>.
  <img src="client_author_book.PNG" />
</p>
