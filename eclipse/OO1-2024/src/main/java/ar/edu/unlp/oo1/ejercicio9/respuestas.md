## Tarea B: Reflexione, charle con el ayudante y responda a las siguientes preguntas.
### a) ¿Por qué cree que este ejercicio se llama "Cuenta con ganchos"? 

### b) En las implementaciones de los métodos extraer() y transferirACuenta()  que se ven en el diagrama, ¿quién es this?¿Puede decir de qué clase es this?
Va ser de la clase que sea instancia del objeto. Puede ser de CajaDeAhorro o CuentaCorriente, ya que estos heredan de Cuenta.

### c) ¿Por qué decidimos que los métodos puedeExtraer() y extraerSinControlar tengan visibilidad "protegido"?
Para que puedan ser accedidos por sus hijos, y por la clase Cuenta 

### d) ¿Se puede transferir de una caja de ahorro a una cuenta corriente y viceversa? ¿por qué? ¡Pruébelo!
Si se puede, porque la clase del parametro es Cuenta y tanto CuentaCorriente como CajaDeAhorro heredan de Cuenta, osea son Cuentas.

### e) ¿Cómo se declara en Java un método abstracto? ¿Es obligatorio implementarlo? ¿Qué dice el compilador de Java si una subclase no implementa un método abstracto que hereda?
Es obligatorio implementarlo y se de  declara poniendo la palabra abstract luego de la visibilidad. 

