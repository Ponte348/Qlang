#!/bin/bash

echo -e "Cleaning up the class files...\n"

rm *.class
rm Classes/*.class
rm Compilador/*.class
rm InterpretadorPil/Pil/*.class
rm Compilador/Classes/*.class
rm Compilador/InterpretadorPil/Pil/*.class

rm result*.txt
rm Compilador/*.pil