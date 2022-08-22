
import {Button , Card} from 'react-bootstrap';


const Person = ({title , text }) => {


    return (
        <Card style={{ width: '18rem' , margin:'20px'}}>
        <Card.Body>
          <Card.Title>{title}</Card.Title>
          <Card.Text>
           {text}
          </Card.Text>
          <Button variant="primary">Go somewhere</Button>
        </Card.Body>
      </Card>
     );
}
 
export default Person;