<!DOCTYPE html>
<html>

<head>
   <title>Calculator</title>
   <script>
      function showResult() {
         var result = "${not empty requestScope.result ? requestScope.result : ''}";
         if (result !== '') {
            document.getElementById("result").innerHTML = "Result: " + result;
         } else {
            document.getElementById("result").innerHTML = "infinity";
         }
      }
   </script>
</head>

<body onload="showResult()">
   <h2>Enter OP1: </h2>
   <form action="calculator" method="post">
      <input type="number" id="num1" name="num1" required><br><br>
      <input type="radio" id="add" name="operator" value="add">
      <label for="add">+</label>
      <input type="radio" id="subtract" name="operator" value="subtract">
      <label for="subtract">-</label>
      <input type="radio" id="multiply" name="operator" value="multiply">
      <label for="multiply">x</label>
      <input type="radio" id="divide" name="operator" value="divide">
      <label for="divide">/</label><br><br>
      <input type="number" id="num2" name="num2" required><br><br>
      <input type="submit" value="Calculate">
   </form>
   <div id="result"></div>
</body>

</html>