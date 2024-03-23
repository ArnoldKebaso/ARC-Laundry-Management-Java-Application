<%-- 
    Document   : Homepage
    Created on : Mar 5, 2024, 2:11:12 PM
    Author     : INFINITY
--%>

</html>
<%@ page  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Homepage</title>
    <style>
        /* Add your CSS styles here */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
        nav {
            background-color: #f4f4f4;
            padding: 10px;
            text-align: center;
        }
        nav a {
            color: #333;
            text-decoration: none;
            padding: 10px 20px;
        }
        nav a:hover {
            background-color: #ddd;
        }
        section {
            padding: 20px;
            text-align: center;
        }
        .container {
            max-width: 800px;
            margin: auto;
        }
        .services {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
            gap: 20px;
            justify-content: center;
            align-items: center;
        }
        .service {
            background-color: #f4f4f4;
            padding: 20px;
            border-radius: 5px;
            text-align: center;
        }
        footer {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
    </style>
</head>
<body>
    <header>
        <h1>Welcome to Laundry System</h1>
    </header>
    <nav>
        <a href="#">Home</a>
        <a href="#">Services</a>
        <a href="Registration.jsp">Registration</a>
         <a href="Login.jsp">Login</a>
    </nav>
    <section>
        <div class="container">
            <h2>Our Services</h2>
            <div class="services">
                <div class="service">
                    <h3>Wash & Fold</h3>
                    <p>Convenient laundry service where we wash, dry, and fold your clothes.</p>
                </div>
                <div class="service">
                    <h3>Dry Cleaning</h3>
                    <p>Professional dry cleaning for delicate garments and special fabrics.</p>
                </div>
                <div class="service">
                    <h3>Ironing</h3>
                    <p>Get your clothes professionally ironed for a crisp, neat look.</p>
                </div>
                <!-- Add more services as needed -->
            </div>
        </div>
    </section>
    <footer>
        <p>&copy; 2024 Laundry System. All rights reserved.</p>
    </footer>
</body>
</html>

