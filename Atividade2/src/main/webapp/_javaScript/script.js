function openBox() {
    var box = document.getElementById("box");
    box.style.display = "block";
}

function closeBox() {
    var box = document.getElementById("box");
    box.style.display="none";
}

function validateNumber(input) {
    input.value = input.value.replace(/[^\d]/g, '');
}

closeBox();