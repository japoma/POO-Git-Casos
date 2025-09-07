GUÍA DE USO DE GIT PARA POO-GIT-CASOS

Estructura del proyecto:

POO-Git-Casos/
├── caso0/
│   └── Holamundo.java
├── caso1/
│   └── UsuarioSimple.java
├── caso2/
│   └── EstudianteInteractivo.java
├── caso3/
│   └── CuentaBancaria.java
├── guia_git.txt
├── informe_final.txt
└── README.txt

Ramas:
- main: rama principal con todos los casos fusionados
- caso0, caso1, caso2, caso3: cada caso en su propia rama para trabajar de manera independiente

Comandos básicos:
- Clonar repositorio:
  git clone https://github.com/tu-usuario/POO-Git-Casos.git

- Cambiar de rama:
  git checkout caso1

- Agregar archivos al área de staging:
  git add archivo.java

- Hacer commit con mensaje explicativo:
  git commit -m "Agregar Caso1: UsuarioSimple.java con métodos básicos"

- Fusionar ramas en main:
  git checkout main
  git merge caso1 -m "Fusionar Caso1: UsuarioSimple.java en main"

- Subir cambios a GitHub:
  git push origin main

Buenas prácticas:
- Mensajes de commit claros y concisos
- Explicar qué se hizo y por qué
- Evitar mensajes genéricos como “cambios” o “arreglos”
