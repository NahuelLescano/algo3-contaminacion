#!/usr/bin/env sh

set -eu

cd "$(dirname "$0")"

encontrados=0
for archivo in ./clases/*.puml ./secuencia/*.puml; do
    [ -e "$archivo" ] || continue
    encontrados=1
    plantuml "$archivo"
done

if [ "$encontrados" -eq 0 ]; then
    echo "No hay diagramas para compilar"
    exit 1
fi

echo "LISTO"
