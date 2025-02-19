#!/bin/bash
# check if we have 1 argument
if [ $# -ne 1 ]; then
    echo "Usage: $0 <example>"
    exit 1
fi

# check if the example exists

# compile example
cd Compilador
java QlangMain $1
mv result*.txt ..