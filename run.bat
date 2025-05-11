@echo off
set JAVA_HOME=C:\Program Files\Java\jdk-22
set PATH=%JAVA_HOME%\bin;%PATH%

REM Update MODULE_PATH to point to JavaFX SDK
set MODULE_PATH=C:\Users\Admin\Documents\Study\LapTrinhJava\javafx-sdk-24.0.1\lib

java --module-path "%MODULE_PATH%" --add-modules javafx.controls,javafx.fxml -cp target/classes com.fldtn.doan.milkteashopmanage.Main
