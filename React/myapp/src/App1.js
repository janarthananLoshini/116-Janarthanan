
import './App.css';
import { useState } from 'react';
import UserTable from './tables/UserTable';
import AddUserForm from './forms/AddUserForm';


const App = () =>{
  const userData = [
    {id:101,name:"Rajesh",username:'rajesh121'},
    {id:102,name:"Raj",username:'raj121'},
    {id:103,name:"Suraj",username:'suraj121'}
  ];

  const[users,setUsers] = useState(userData);

  const addUser = (user) => {
    user.id = users.length+101
    setUsers([...users,user]);
  }

  return(
    <div className="container">
      <h1>CRUD Application- My-App</h1>

      <div className='flex-row'>
        <div className='flex-largs'>
        <h2>Add User</h2>
          <AddUserForm adduser={addUser}/>        
        </div>
        <div className='flex-largs'>
          <h2>View Users Data: </h2>
          <UserTable users={users}/>
        </div>
      </div>
    </div>
  );

}

export default App;

