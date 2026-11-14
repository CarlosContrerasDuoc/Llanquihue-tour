# Llanquihue Tour

Aplicación de consola en Java que lee tours desde un archivo de texto, muestra la lista completa y permite filtrarlos por destino.

## Estructura del proyecto

- `src/model/`: clase `Tour`, que representa los datos de cada tour.
- `src/data/`: clase `GestorTours`, que carga los tours desde el archivo.
- `src/ui/`: clase principal `LlanquihueTourApp`.
- `src/resources/Tours.txt`: datos de los tours, separados por punto y coma.

## Cómo ejecutar

1. Descarga el proyecto desde GitHub con **Code → Download ZIP** y descomprime el archivo.
2. Abre Apache NetBeans.
3. Selecciona **File → Open Project**.
4. Busca la carpeta del proyecto que descomprimiste. Selecciona la carpeta que contiene `build.xml` y pulsa **Open Project**.
5. En la ventana **Projects**, despliega el proyecto y abre **Source Packages → ui**.
6. Haz clic derecho en `LlanquihueTourApp.java` y selecciona **Run File**.
7. Revisa la ventana **Output** de NetBeans para ver la lista completa y los tours filtrados por destino `Puerto Varas`.

Mantén `Tours.txt` dentro de `src/resources/`, porque el programa busca el archivo en esa ubicación.

## Formato de los datos

Cada línea de `Tours.txt` contiene el nombre, el destino y el precio, separados por punto y coma:

```text
Tour gastronomico;Llanquihue;35000
Paseo lacustre;Puerto Varas;25000
Ruta de los volcanes;Frutillar;60000
