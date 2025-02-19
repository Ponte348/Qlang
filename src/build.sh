#!/bin/bash
javac ./Compilador/QlangOutput.java
echo -e "Compiling everything...\n"

javac InterpretadorPil/Pil/*.java
javac Classes/*.java
javac Compilador/InterpretadorPil/Pil/*.java
javac Compilador/Classes/*.java
javac Compilador/*.java