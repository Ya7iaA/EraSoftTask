<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <form action="data.jsp" method="post">
        <div class="form-group">
            <label for="fullName">Full Name</label>
            <input type="text" id="fullName" name="fullName" placeholder="Enter your full name" required>
        </div>

        <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" placeholder="Enter your password" required>
        </div>

        <div class="form-group">
            <label for="age">Age</label>
            <input type="number" id="age" name="age" placeholder="Enter your age" required>
        </div>

        <div class="form-group">
            <label>Address (Radio)</label>
            <div class="radio-group">
                <label><input type="radio" name="addressRadio" value="Cairo"> Cairo</label>
                <label><input type="radio" name="addressRadio" value="Alex"> Alex</label>
                <label><input type="radio" name="addressRadio" value="Menofia"> Menofia</label>
            </div>
        </div>

        <div class="form-group">
            <label for="addressSelect">Address (Select)</label>
            <select id="addressSelect" name="addressSelect">
                <option value="Cairo">Cairo</option>
                <option value="Alex">Alex</option>
                <option value="Menofia">Menofia</option>
            </select>
        </div>

        <button type="submit">Submit</button>
    </form>
</body>
</html>