; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

#define MyAppName "Simple Curriculum"
#define MyAppVersion "1.0"
#define MyAppPublisher "Danvoo17"
#define MyAppURL "https://github.com/Danvoo17/SimpleCurriculum"
#define MyAppExeName "Simple Curriculum.exe"

[Setup]
; NOTE: The value of AppId uniquely identifies this application. Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{20A3865D-801B-48BA-8DA1-0039560566D6}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
AppPublisherURL={#MyAppURL}
AppSupportURL={#MyAppURL}
AppUpdatesURL={#MyAppURL}
DefaultDirName={autopf}\{#MyAppName}
UninstallDisplayIcon={app}\{#MyAppExeName}
DefaultGroupName={#MyAppName}
AllowNoIcons=yes
; Uncomment the following line to run in non administrative install mode (install for current user only).
;PrivilegesRequired=lowest
OutputDir=C:\Users\Ronny Trinidad\Desktop
OutputBaseFilename=Simple Curriculum Setup
SetupIconFile=C:\Users\Ronny Trinidad\Desktop\JJJ\COSAS\cosas de david\Proyects\SimpleCurriculum\SimpleCurriculum\target\setup.ico
SolidCompression=yes
WizardStyle=modern

[Languages]
Name: "spanish"; MessagesFile: "compiler:Languages\Spanish.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "C:\Users\Ronny Trinidad\Desktop\JJJ\COSAS\cosas de david\Proyects\SimpleCurriculum\SimpleCurriculum\target\{#MyAppExeName}"; DestDir: "{app}"; Flags: ignoreversion
Source: "C:\Users\Ronny Trinidad\Desktop\JJJ\COSAS\cosas de david\Proyects\SimpleCurriculum\SimpleCurriculum\target\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{group}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{group}\{cm:ProgramOnTheWeb,{#MyAppName}}"; Filename: "{#MyAppURL}"
Name: "{group}\{cm:UninstallProgram,{#MyAppName}}"; Filename: "{uninstallexe}"
Name: "{autodesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon
Name: "{group}\Descargar Java 23"; Filename: "https://download.oracle.com/java/23/archive/jdk-23.0.2_windows-x64_bin.exe"

[Run]
Filename: "https://download.oracle.com/java/23/archive/jdk-23.0.1_windows-x64_bin.exe"; Description: "Descargar e instalar Java 23.0.2 (REQUERIDO)"; Flags: postinstall shellexec unchecked
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: nowait postinstall skipifsilent

