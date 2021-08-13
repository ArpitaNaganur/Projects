
import React, { Component } from "react";
import { Grid } from "react-bootstrap";
class Footer extends Component {
  render() {
    return (
        <footer className="footer">
          <Grid fluid>
            <nav className="pull-left">
              <ul>
                <li>
                  <a href="#pablo"><i className="fa fa-home fa-lg"></i></a>
                </li>
                <li>
                  <a href="mailto:ya@gao.com"><i className="fa fa-envelope fa-lg"></i></a>
                </li>
                <li>
                  <a href="https://www.facebook.com/bricklane"><i className="fa fa-facebook-f fa-lg"></i></a>
                </li>
                <li>
                  <a href="https://api.whatsapp.com/send?phone=919999999999 "><i className="fa fa-whatsapp fa-lg"
                                                                                 aria-hidden="true"></i></a>
                </li>
              </ul>
            </nav>
            <p className="copyright pull-right">
              &copy; {new Date().getFullYear()}{" "}
              <a href="http://www.bricklane.com">
                Brick Lane
              </a>
              , adding care to your property...
            </p>
          </Grid>
        </footer>
    );
  }
}
export default Footer;