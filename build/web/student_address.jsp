<%-- 
    Document   : student_address
    Created on : Mar 13, 2024, 12:31:30 AM
    Author     : Krafty Coder
--%>

<script language="JavaScript">
function validate(form)
{
    if (form.blockName.value==="") 
    {
        alert("Please fill in your Block Name");
        form.blockName.focus();
    }
    else if (form.hostelName.value==="")
    {
        alert("Please enter your Hostel Name");
        form.hostelName.focus();
    }
    else if (form.roomNumber.value==="")
    {
        alert("Please Confirm your Room Number");
        form.roomNumber.focus();
    }
    else
    {
        form.submit();
    }
}
</script>






<%--<%@ page import="business.User"%>--%>
<%--
    // get attributes from the request
    User user = (User) request.getAttribute("user");
    String message = (String) request.getAttribute("message");

    // handle null values
    if (user == null) user = new User();
    if (message == null) message = "";
--%>
        <h1>Please Enter your Contact Details</h1>
<form action="Address" method="post">
            <table cellspacing="5" border="0">
    <tr>
      <td align="right">Block Name:</td>
      <td><select name ="blockName"style="padding: 8px; width: 250px;" >
              <option value="male">male</option>
              <option value="female">female</option>
      </select>
          </td>
    </tr>
          <td align="right">Hostel Name</td>
          <td><select name="hostelName" style="padding: 8px; width: 250px;" >
              <option value="male">male</option>
              <option value="female">female</option>
      </select>
          </td>
    <tr>
      <td align="right">Room Number:</td>
      <td><input type="text" name="roomNumber" style="padding: 8px; width: 250px;"></td>
    </tr>
    <tr>
    </tr>
    <tr>
      <td></td>
      <td><br><input type="submit" value="Submit" )" style="padding: 10px 20px; background-color: #4CAF50; color: white; border: none; border-radius: 4px; cursor: pointer;"></td>
    </tr>
    </table>
 </form>