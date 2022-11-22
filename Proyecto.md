Un sistema de filas para los probadores en una tienda de vestidos<br/>
Localización: Vestidores<br/>
Entidades: Clientes, Vestidores<br/>
Atributos: Número de probadores<br/>
Actividades: Tiempo entre llegada de un cliente, Tiempo de uso<br/>
Eventos: Entrada de un cliente a la fila, Entrada de un cliente al probador, Salida de un cliente del probador, Salida de cliente en la fila.<br/>
Estados: número de clientes en la fila, número de probadores ocupados.<br/>
<table>
  <tr>
    <td>Cliente</td>
    <td>(Actividad)<br>Tiempo entre llegada<br>{t}</td>
    <td>(Evento)<br>Llegada a la fila<br>{t}</td>
    <td>(Actividad)<br>Tiempo de uso<br>{t}</td>
    <td>(Evento)<br>Entrada al probador<br>{t}</td>
    <td>(Evento)<br>Salida del probador<br>{t}</td>
    <td>(Evento)<br>Salida de la fila<br>{boolean}</td>
    <td>(Salida)<br>tiempo en fila<br>{t}</td>
    <td>(Salida)<br>Salidas de probadores<br>{t1, …, tn}</td>
  </tr>
  <tr>
    <td>0</td>
    <td>9</td>
    <td></td>
    <td>10</td>
    <td></td>
    <td></td>
    <td>False</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>1</td>
    <td>9</td>
    <td></td>
    <td>17</td>
    <td></td>
    <td></td>
    <td>False</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>2</td>
    <td>10</td>
    <td></td>
    <td>19</td>
    <td></td>
    <td></td>
    <td>False</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>3</td>
    <td>7</td>
    <td></td>
    <td>10</td>
    <td></td>
    <td></td>
    <td>False</td>
    <td></td>
    <td></td>
  </tr>
  <tr>
    <td>4</td>
    <td>6</td>
    <td></td>
    <td>17</td>
    <td></td>
    <td></td>
    <td>True</td>
    <td></td>
    <td></td>
  </tr>
</table>
<br/>
Llegada a la fila =<br/>
•	Llegada del anterior + el tiempo entre llegada de este<br/>
Entrada al probador = <br/>
•	Si Salida de la fila = false: -1<br/>
•	Si la salida del probador del cliente anterior es mayor a la llegada a la fila de este cliente: Salida del probador del anterior cliente.<br/>
•	De lo contrario: Llegada a la fila.<br/>
Salida del probador = <br/>
•	Si Salida de la fila: Salida del probador del cliente anterior<br/>
•	De lo contrario: Entrada al probador + Tiempo de uso<br/>
Tiempo en fila =<br/>
•	Si Salida de la fila: -1<br/>
•	De lo contrario: Entrada al probador – Llegada a la fila<br/>
<br/>
s
