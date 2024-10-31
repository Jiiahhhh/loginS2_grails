<%--
  Created by IntelliJ IDEA.
  User: ilal
  Date: 31/10/24
  Time: 14.45
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<h1>Form Tambah Event</h1>
<g:form action="saveEvent">
    <div>
        <label>Nama Event:</label>
        <g:textField name="nama"/>
    </div>
    <div>
        <label>Harga:</label>
        <g:textField name="harga"/>
    </div>
    <div>
        <label>Lokasi:</label>
        <g:textField name="lokasi"/>
    </div>
    <div>
        <g:submitButton name="submit" value="Simpan Event"/>
    </div>
</g:form>

<h2>Daftar Event Anda</h2>
<table border="1">
    <tr>
        <th>Nama</th>
        <th>Harga</th>
        <th>Lokasi</th>
    </tr>
    <g:each in="${events}" var="event">
        <tr>
            <td>${event.nama}</td>
            <td>${event.harga}</td>
            <td>${event.lokasi}</td>
        </tr>
    </g:each>
</table>
</body>
</html>