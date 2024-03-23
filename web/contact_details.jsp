<%-- 
    Document   : contact_details
    Created on : Mar 12, 2024, 11:47:09 PM
    Author     : Krafty Coder
--%>
<script language="JavaScript">
function validate(form)
{
    if (form.firstName.value==="") 
    {
        alert("Enter the day you want to pickup your item");
        form.firstName.focus();
    }
    else if (form.lastName.value==="")
    {
        alert("Please enter your Item(s) Name");
        form.lastName.focus();
    }
    else if (form.phoneNumber.value==="")
    {
        alert("Please Confirm the weight of your item(s)");
        form.phoneNumber.focus();
    }
    else
    {
        form.submit();
    }
}
</script>






<%@ page import="business.User"%>
<%
    // get attributes from the request
    User user = (User) request.getAttribute("user");
    String message = (String) request.getAttribute("message");

    // handle null values
    if (user == null) user = new User();
    if (message == null) message = "";
%>
        <h1>Please Enter your Contact Details</h1>
<form action="customerInfoServlet" method="post">
            <table cellspacing="5" border="0">
    <tr>
      <td align="right">First Name:</td>
      <td><input type="text"  name="firstName"   style="padding: 8px; width: 250px;" value="<%= user.getFirstName() %>"></td>
    </tr>
    <tr>
      <td align="right">Last Name:</td>
      <td><input type="text"  name="lastName" style="padding: 8px; width: 250px;" value="<%= user.getLastName() %>"></td>
    </tr>
    
    <tr>
      <td align="right">Phone number</td>
      <td><input type="text" name="phoneNumber" style="padding: 8px; width: 250px;" value="<%= user.getPhoneNumber() %>"></td>
    </tr>
    <tr>
      <td></td>
      <td><br><input type="button" value="Submit" onClick="validate(this.form)" style="padding: 10px 20px; background-color: #4CAF50; color: white; border: none; border-radius: 4px; cursor: pointer;"></td>
    </tr>
    </table>
 </form>
