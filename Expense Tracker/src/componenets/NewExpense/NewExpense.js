import ExpenseForm from './ExpenseForm';
import './NewExpense.css';

const NewExpense = (props) =>{
    const saveExpenseHandler = (enteredEntry) =>{
        const expenseData = {
            ...enteredEntry,
            id: Math.random().toString()
        }
        props.onAddExpense(expenseData);

    }
    return <div className='new-expense'>
        <ExpenseForm onSaveExpense={saveExpenseHandler}/>
    </div>
}

export default NewExpense;