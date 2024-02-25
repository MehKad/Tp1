<!DOCTYPE html>
<html>

<head>
   <title>Servlet Liste</title>
</head>

<body bgcolor="white">
   <h3>Add</h3>
   <form action="ServletListe" method="POST">
      Titre: <input type="text" name="titre"><br>
      Description: <input type="text" name="description"><br>
      <input type="submit" name="add" value="Add">
   </form>
   <br>
   <hr>
   <br>
   <table border="1">
      <thead>
         <tr>
            <th>Titre</th>
            <th>Description</th>
         </tr>
      </thead>
      <tbody>
         <% // Iterate through the list of elements and display them java.util.List<Element> elements = (java.util.List
            <Element>) request.getAttribute("elements");
               if (elements != null) {
               for (Element element : elements) {
               %>
               <tr>
                  <td>
                     <%= element.getTitre() %>
                  </td>
                  <td>
                     <%= element.getDescription() %>
                  </td>
               </tr>
               <% } } %>
      </tbody>
   </table>
</body>

</html>