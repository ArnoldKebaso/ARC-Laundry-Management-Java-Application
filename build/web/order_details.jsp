<%-- 
    Document   : order_details
    Created on : Mar 13, 2024, 1:10:16 AM
    Author     : Krafty Coder
--%>

<script language="JavaScript">
function validate(form)
{
    if (form.pickUp.value==="") 
    {
        alert("Enter the day you want to pickup your item");
        form.pickUp.focus();
    }
    else if (form.time.value==="")
    {
        alert("Please Pickup time");
        form.time.focus();
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
<form action="OrderDetailsServlet" method="post">
            <table cellspacing="5" border="0">
    <tr>
      <td align="right">Pickup Date:</td>
      <td><input type="date" id="datemin" name="pickUp" min="2000-01-02"  style="padding: 8px; width: 250px;" "></td>
    </tr>
    <tr>
      <td align="right">Pickup Time:</td>
      <td><input type="time"  name="time" style="padding: 8px; width: 250px;" "></td>
    </tr>
    <tr>
      <td></td>
      <td><br><input type="button" value="Submit" onClick="validate(this.form)" style="padding: 10px 20px; background-color: #4CAF50; color: white; border: none; border-radius: 4px; cursor: pointer;"></td>
    </tr>
    </table>
 </form>
