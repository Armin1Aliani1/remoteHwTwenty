<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        /* login */
        * {
            margin: 0;
            padding: 0;
        }

        .myDivOne {
            text-align: center;
            width: 50%;
            height: 300px;
            border: 1px solid black;
            margin-left: 25%;
            padding-top: 3%;
            background-color: white;
        }

        .myInputOne, .myInputTwo {
            width: 50%;
            height: 50px;
            text-align: center;
            margin-top: 4%;
        }

        .myInputOne {
            background-color: rgb(206, 204, 204);
        }

        .bodyLogin, .myInputTwo {
            background-color: rgb(70, 70, 205);
            color: white;
        }

        .hOne {
            color: rgb(183, 180, 180);
        }
    </style>
</head>
<body class="bodyLogin">
<div class="myDivOne">
    <h1 class="hOne">Login</h1>
    <form action="userLogin">
        <input class="myInputOne" type="text" name="username" placeholder="username">
        <br>
        <input class="myInputOne" type="password" name="password" placeholder="password">
        <br>
        <input class="myInputTwo" type="submit" value="Login">
    </form>
</div>
</body>
</html>