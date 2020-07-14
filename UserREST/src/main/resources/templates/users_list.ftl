<!DOCTYPE html>
<html lang="en">
<div id="header">
  <h2 class="container-table100">Listado de Usuarios</h2>
</div>
<div id="content">  
  <br/>
  <table class="datatable">
    <tr>
      <th>Nombre</th>
      <th>Saldo</th>
      <th>Fecha</th>
    </tr>
    <#list model["users"] as user>
      <tr>
        <td>${user.nombre}</td>
        <td>${user.saldo}</td>
        <td>${user.fecha}</td>
      </tr>
    </#list>
  </table>
</div>