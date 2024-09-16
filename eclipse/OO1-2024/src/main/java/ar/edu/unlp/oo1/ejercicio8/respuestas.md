Analice cada uno de los siguientes fragmentos de código y resuelva las tareas indicadas abajo:
```java
Gerente alan = new Gerente("Alan Turing");
double aportesDeAlan = alan.aportes();

Gerente alan = new Gerente("Alan Turing");
double sueldoBasicoDeAlan = alan.sueldoBasico();
```

Tareas:
1. Liste todos los métodos, indicando nombre y clase, que son ejecutados como resultado del envío del último mensaje de cada fragmento de código (por ejemplo, (1) método +aportes de la clase Empleado, (2) ...)

metodo aportes() de la clase Gerente:
- ejecuta montoBasico de Gerente y retorna 57000. Lo multiplica por 0.05

metodo sueldoBasico() de la clase Gerente:
- Lo busca en la clase Gerente, no existe. Lo busca en EmpleadoJerarquico, esta, lo ejecuta.
Dentro de EmpleadoJerarquico SueldoBasico envia mensaje sueldoBasico a su clase padre (Empleado), y bonoPorCategoria a la clase Empaldo Jerarquico.

2. ¿Qué valores tendrán las variables aportesDeAlan y sueldoBasicoDeAlan luego de ejecutar cada fragmento de código?
aportesDeAlan =  57000 * 0.05
sueldoBasicoDeAlan = 35000 + 8000


