# Primera Parte
Punto a:

1. **Implementaciones de Map en Java**:  
   Java provee varias implementaciones de `Map`, siendo las de uso general:
   - `HashMap`: no garantiza orden.
   - `LinkedHashMap`: mantiene el orden de inserción.
   - `TreeMap`: ordena las claves en orden natural o por un comparador.
   - `Hashtable`: sincronizada, no permite nulos.

2. **Consulta de clave en un mapa**:  
   Para verificar si un mapa contiene una clave específica, se usa `containsKey(Object key)`.  
   Las claves deben implementar los métodos `equals()` y `hashCode()` correctamente para que el mapa funcione como se espera.

3. **Recuperación de objeto asociado a una clave**:  
   Se usa `get(Object key)`.  
   Si la clave no existe, devuelve `null`.

4. **Agregar claves y valores**:  
   Con `put(K key, V value)`, se agrega una clave y su valor.  
   Si la clave ya existe, `put` reemplaza el valor anterior.  
   - `HashMap` y `LinkedHashMap` permiten claves y valores nulos, pero `TreeMap` y `Hashtable` no.

5. **Eliminar claves y valores**:  
   Con `remove(Object key)`, se elimina una clave y su valor.  
   No es necesario verificar la presencia de la clave; si no existe, no ocurre nada.

6. **Reemplazo de valor en un mapa**:  
   Con `replace(K key, V value)` se cambia el valor asociado a una clave, solo si esta existe. Alternativamente, `replace(K key, V oldValue, V newValue)` reemplaza solo si el valor actual coincide con `oldValue`.

7. **Iteración de un mapa y uso de Streams**:  
   - Con `keySet()` para iterar sobre claves.
   - Con `values()` para iterar sobre valores.
   - Con `entrySet()` para iterar sobre pares clave-valor.
   - También se pueden usar Streams (`map.entrySet().stream()`) para procesar el mapa de manera funcional.

# Segunda Parte

1.Metodos:
- boolean add(T element);
- int occurrencesOf(T element);
- void removeOccurrence(T element);
- void removeAll(T element);
- int size();

2. Se crea una variable de instancia de tipo Map<T, Integer>



