let registrationForm = document.getElementById("registration-form");

registrationForm.addEventListener("submit", function(event) {
    event.preventDefault();
    let namesUser = document.getElementById("names-user");
    let namesUserValue = namesUser.value;
    let lastNamesUser = document.getElementById("last-names-user");
    let lastNamesUserValue = lastNamesUser.value;
    let documentType = document.getElementById("document-type");
    let documentTypeValue = documentType.value;
    let documentNumber = document.getElementById("document-number");
    let documentNumberValue = documentNumber.value;
    let age = document.getElementById("age");
    let ageValue = age.value;
    let phoneNumber = document.getElementById("phone-number");
    let phoneNumberValue = phoneNumber.value;
    let address = document.getElementById("address");
    let addressValue = address.value;

    if(ageValue < 18) {
        alert("Eres menor de edad, debes registrarte con los datos de un adulto responsable")
    } else {
        userData = {
            "name": namesUserValue,
            "lastName": lastNamesUserValue,
            "documentType": documentTypeValue,
            "documentNumber": documentNumberValue,
            "age": ageValue,
            "phone": phoneNumberValue,
            "address": addressValue,
        }
        
        localStorage.setItem("userData" + (localStorage.length + 1), JSON.stringify(userData));
        alert("¡Los datos se guardaron con éxito!");
    }

});