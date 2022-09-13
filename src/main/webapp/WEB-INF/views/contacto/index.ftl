<h2>Datos de Contacto</h2>
<form action="${context_path}/contacto/procesar_datos" method="POST" class="form_contacto">
    <p>Nombre: </p> <input type="text" name="nombre" required>
    <p>Edad: </p> <input type="number" name="edad" min="0" required>
    <p>E-mail: </p> <input type="text" name="email" required>
    <p>Motivos de contacto:</p>
    <select name="motivos" multiple>
        <#if motivos?has_content>
        <#list motivos as item>
        <option value="${item.id}">${item.descripcion}</option>
        </#list>
        </#if>
    </select>
    <p>Comentario:</p> <textarea name="comentario" row="4" cols="80" required></textarea>
    <hr>
    <button type="submit">Enviar contacto</button>            
</form>
