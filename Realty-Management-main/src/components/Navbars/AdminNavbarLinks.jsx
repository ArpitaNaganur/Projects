
import React, { Component } from "react";
import { NavItem, Nav, NavDropdown, MenuItem } from "react-bootstrap";

class AdminNavbarLinks extends Component {
  render() {
    const notification = (

    );
    return (
      <div>

        <Nav pullRight>
          <NavItem eventKey={1} href="#">
            Account
          </NavItem>

          <NavItem eventKey={3} href="#">
            Log out
          </NavItem>
        </Nav>
      </div>
    );
  }
}

export default AdminNavbarLinks;
