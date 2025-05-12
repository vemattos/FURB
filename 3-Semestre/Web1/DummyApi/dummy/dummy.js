function consultarCEP() {
    fetch('https://dummy.restapiexample.com/api/v1/employees') 
    .then(response => {
        if (!response.ok) {
            throw new Error("Não foi possível encontrar o employee")
        }
        return response.json();
    })
    .then(data => {
        if (!data.erro) {
            console.log(data)
          document.getElementById('id').value = data.id;
          document.getElementById('name').value = data.employee_name;
          document.getElementById('salary').value = data.employee_salary;
          document.getElementById('age').value = data.employee_age;
        } else {
          alert('Employee not found');
        }
      })
    .catch(error => console.error(error));
}
