@echo off

mkdir DocumentoCreadorDeCarpetaDeProyecto
cd DocumentoCreadorDeCarpetaDeProyecto

mkdir proyectoFinal
cd proyectoFinal

mkdir src
cd src

REM  Carpeta controller
mkdir controller
cd controller
type nul > controller.py
cd ..

REM Carpeta view 
mkdir view
cd view
type nul > view.py
cd ..

REM Carpeta model
mkdir model
cd model
type nul > model.py
cd ..

REM Archivo main.py en src
type nul > main.py
cd ..

REM Crear entorno virtual 
py -m venv .venv

REM Crear carpeta notebooks con un ejemplo
mkdir notebooks
cd notebooks
type nul > ejemplo.ipynb
cd ..


echo Proyecto creado correctamente.


REM Abrir CMD con el venv ACTIVADO
start cmd /k ".venv\Scripts\activate.bat && echo Entorno virtual ACTIVADO"

REM Abrir Visual Studio
code .

pause
