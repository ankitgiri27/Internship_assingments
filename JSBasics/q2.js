let nb = document.querySelector("button");
nb.addEventListener('click',Sortingg);

function Sortingg(){
    const fruits = [
        "Banana",
        "Orange",
        "Apple",
        "Mango",
        "Watermelon",
        "Grapes",
        "Papaya",
      ];
      alert("before sorting : "+fruits);
       // First sort the array
       fruits.sort();

       // Then reverse it:
       fruits.reverse();
       alert("after sorting : "+fruits);
}