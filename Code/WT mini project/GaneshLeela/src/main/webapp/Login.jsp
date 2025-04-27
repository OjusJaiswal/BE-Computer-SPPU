<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>  
<hr/>  
  <style type="text/css">
	body {
    background-image: url("join1.jpg");
    background-size: cover;
    font-family: Montserrat;
    margin: 0px;

}
#section5
{
    
    width: 100%;
    height: 35%;
    margin: 0 auto;
    padding:0px;
    display:inline-block;
    
}
.login_cllg-block {
    width: 320px;
    padding: 10px;
    background: #fff;
    border-radius: 5px;
    border-top: 5px solid #ff656c;
    margin: 130 auto;
}

.login_cllg-block h1 {
    text-align: center;
    color: #000;
    font-size: 18px;
    text-transform: uppercase;
    margin-top: 0;
    margin-bottom: 20px;
}

.login_cllg-block input {
    width: 100%;
    height: 42px;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #ccc;
    margin-bottom: 20px;
    font-size: 14px;
    font-family: Montserrat;
    padding: 0 20px 0 50px;
    outline: none;
}

.login_cllg-block input#username {
    background: #fff url('u0XmBmv.png') 20px top no-repeat;
    background-size: 16px 80px;
}

.login_cllg-block input#username:focus {
    background: #fff url('u0XmBmv.png') 20px bottom no-repeat;
    background-size: 16px 80px;
}

.login_cllg-block input#password {
    background: #fff url('Qf83FTt.png') 20px top no-repeat;
    background-size: 16px 80px;
}

.login_cllg-block input#password:focus {
    background: #fff url('Qf83FTt.png') 20px bottom no-repeat;
    background-size: 16px 80px;
}

.login_cllg-block input:active, .login_cllg-block input:focus {
    border: 1px solid #ff656c;
}

.login_cllg-block button {
    width: 100%;
    height: 40px;
    background: #ff656c;
    box-sizing: border-box;
    border-radius: 5px;
    border: 1px solid #e15960;
    color: #fff;
    font-weight: bold;
    text-transform: uppercase;
    font-size: 14px;
    font-family: Montserrat;
    outline: none;
    cursor: pointer;
}

.login_cllg-block button:hover {
    background: #ff7b81;
}
#logo{
  position: fixed;
  left:0;
  top:3;
  height:4;
  width:5;
}
span.a {
  display: block; 
  width: 100%;
  padding: 1px;
  border: 1px solid blue;  
  background-color: #BB8FCE; 
  color: white;
  float: right;
  position:relative;
}
img:hover {
  animation: shake 0.5s;
  animation-iteration-count: infinite;
}
img{
	width:50px;
	float: left; 
	margin-right: 10px; 
}
</style>  
<%





%>
 <span class="a">
<div class="logo">
<img src="logosociety1.jpg" alt="Ganesh Leela Apartment">
<h1>Ganesh Leela Apartment</h1>

</div>
</span> 
 <br/>   
<div id="mainsection">	 
	 <div id="section5">
        <div class="login_cllg-block">
            <h1>Login</h1>
            <input type="text" value="" placeholder="Username"  name="username" id="username" />
            <input type="password" value="" placeholder="Password" name="password"  id="password" />
            <button  onclick="location.href='Logout.html'">Submit</button>
        </div>
		</div>