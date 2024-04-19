let userCardsContainer = document.getElementById("user-cards-container");
document.addEventListener("DOMContentLoaded", function()  {
    for (let i = 0; i < localStorage.length; i++) {
        let userData = JSON.parse(localStorage.getItem(localStorage.key(i)));
        createUserCard(userData);
    }
});


function createUserCard(userData) {
    let card = document.createElement("div");
    card.classList.add("user-card");
    let name = document.createElement("h2");
    name.textContent = userData.name + " " + userData.lastName;
    let documentType = document.createElement("p");
    documentType.textContent = "Tipo de documento: " + userData.documentType;
    let documentNumber = document.createElement("p");
    documentNumber.textContent = "Número de documento: " + userData.documentNumber;
    let age = document.createElement("p");
    age.textContent = "Edad: " + userData.age;
    let phone = document.createElement("p");
    phone.textContent = "Teléfono: " + userData.phone;
    let address = document.createElement("p");
    address.textContent = "Dirección: " + userData.address;
    card.appendChild(name);
    card.appendChild(documentType);
    card.appendChild(documentNumber);
    card.appendChild(age);
    card.appendChild(phone);
    card.appendChild(address);
    userCardsContainer.appendChild(card);
}