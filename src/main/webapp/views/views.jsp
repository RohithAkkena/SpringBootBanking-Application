<center><h1><b>SDFC BANK</b></h1></center><br>
		<center><h3>EXTRAORDINARY SERVICES</h3></center>
			<div style="background-color: blanchedalmond;">
		
		<center>
			<a href="/home"><b>Home</b></a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="/newaccount"><b>New Account</b></a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="/balance"><b>Balance</b></a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="/deposit"><b>Deposit</b></a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="/withdraw"><b>Withdraw</b></a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="/transfer"><b>Transfer</b></a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="/close"><b>Close ACC</b></a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="/about"><b>AboutUs</b></a>
		<a href="/viewaccount"><b>ViewAccount</b></a>
		</center>	
	</div>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<h1>Product Details Here</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr>
    <th>ACCOUNT NUMBER</th>
    <th>NAME</th>
    <th> PASSWORD</th>
    <th>CON_PASSWORD</th>
     <th>AMOUNT</th>
      <th>MOBILE_NUMBER</th>
      <th>ADDRESS</th>
     <th>STATUS</th>
      <th>DELETE</th>
      <th>EDIT</th>
    </tr>
   <c:forEach var="account" items="${Account1s}">   
   <tr>  
   <td>${account.account_number}</td>  
   <td>${account.name}</td>  
   <td>${account.password}</td>  
   <td>${account.con_password}</td>  
   <td>${account.amount}</td> 
   <td>${account.mobile_num}</td>
   <td>${account.address}</td>
 <td>${account.status}</td>
  <td><a href="/delete/${account.account_number}">Delete</a></td>
   <td><a href="/update/${account.account_number}">Edit</a></td>
    </tr>  
   </c:forEach>  
   </table>  
   <br/><p></p>
   
   <a href="/newaccount">Add new account</a>
   </body>