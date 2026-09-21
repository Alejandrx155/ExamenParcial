# Examen Parcial - Sistema de Gestión de Cuentas Bancarias

Aplicación de escritorio en **Java (Swing)** desarrollada como parte del examen del primer parcial para la gestión y cálculo de operaciones en cuentas bancarias (**Cuenta de Ahorro** y **Cuenta Corriente**).

---

## 📌 Características Principales

* **Interfaz Gráfica (GUI):** Diseñada en Java Swing con soporte para selección de tipos de cuenta mediante un `JComboBox`.
* **Validación de Datos Input:**
  * Control de campos requeridos (Titular, Número de Cuenta, Saldo Inicial, etc.).
  * Verificación de formato numérico (evita errores por `NumberFormatException`).
  * Validación de montos mayores a cero ($>0$).
* **Procesamiento de Cuenta de Ahorros:**
  * Proyección mensual con interés compuesto simple por depósitos periódicos.
  * Cálculo automático de intereses generados.
  * Verificación de promociones o descuentos especiales (ej. Tecno PC si el saldo final supera $1000).
* **Procesamiento de Cuenta Corriente:**
  * Manejo de límites de crédito y montos usados.
  * Aplicación de cargos mensuales por mantenimiento.
* **Resumen en Tiempo Real:** Muestra el resultado formateado a dos decimales dentro de un área de texto (`JTextArea`).

---

## 🛠️ Tecnologías Utilizadas

* **Lenguaje:** Java (JDK 8+)
* **Librería Gráfica:** Java Swing / AWT
* **IDE Recomendado:** NetBeans IDE / IntelliJ IDEA / Eclipse
* **Control de Versiones:** Git & GitHub

---
Hecho por Alejandrx15
## 📁 Estructura del Proyecto

```text
ExamenParcial/
│
├── build/                 # Archivos compilados (.class)
├── nbproject/             # Configuración del proyecto NetBeans
├── src/
│   └── examenmaldonado/
│       ├── ExaMaldonado.java       # Interfaz gráfica principal (JFrame)
│       ├── CuentaAhorro.java       # Lógica de Cuenta de Ahorro
│       └── CuentaCorriente.java    # Lógica de Cuenta Corriente
├── build.xml              # Script de construcción Ant
└── manifest.mf            # Archivo de manifiesto
