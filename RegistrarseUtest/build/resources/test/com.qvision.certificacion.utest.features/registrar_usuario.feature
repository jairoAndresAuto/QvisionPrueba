# language: es
  ## autor: jairo andres garcia - jairo_garcia82122@elpoli.edu.co

  Característica: Yo como automatizador
    Deseo revisar el registro de usuario en la pagina
    Para validar que este funcionando de forma correcta

  Escenario: Registrar usuario utest
    Dado que me encuentro en la pagina de Utest
    Cuando Procedo a realizar el registro e ingreso los datos
      |nombre|apellido|correo|med|dia|anno|contrasena|
      |jairo| Andres|jairo.garcia@hotmail.com|November|28|1992|Andres12345.|
    Y se puede ver que el registro es exitoso
    Entonces inicio sesion para validar registro exitoso