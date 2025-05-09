@echo off
set JAVA_HOME=C:\Program Files\Java\jdk-22
set PATH=%JAVA_HOME%\bin;%PATH%

set MODULE_PATH=%USERPROFILE%\.m2\repository\org\openjfx\javafx-controls\21.0.2\javafx-controls-21.0.2.jar;%USERPROFILE%\.m2\repository\org\openjfx\javafx-fxml\21.0.2\javafx-fxml-21.0.2.jar;%USERPROFILE%\.m2\repository\org\openjfx\javafx-graphics\21.0.2\javafx-graphics-21.0.2.jar

java --module-path "%MODULE_PATH%" --add-modules javafx.controls,javafx.fxml,javafx.graphics -cp target/milkteashop_manager_system-1.0-SNAPSHOT.jar com.fldtn.doan.milkteashopmanage.Main 