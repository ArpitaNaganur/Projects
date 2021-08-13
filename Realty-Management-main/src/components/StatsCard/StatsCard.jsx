
import React, { Component } from "react";
import { Row, Col } from "react-bootstrap";

export class StatsCard extends Component {
  render() {
    return (
      <div className="card card-stats">
        <div className="content">
          <br/>
          <b><span fontSize="20">{this.props.title}</span></b>
          <Row>
            <Col xs={5}>
              <div className="icon-big text-center icon-warning pull-left">
                {this.props.bigIcon}
              </div>
            </Col>
            <Col xs={7}>
              {/*<p>Stats Card Row1 Col2</p>*/}
              <div className="numbers">
                <p>{this.props.statsText}</p>
                {this.props.statsValue}
              </div>
            </Col>
          </Row>
          <div className="footer">
            <hr />
            <div className="stats">
              {this.props.statsIcon} {this.props.statsIconText}
            </div>
          </div>
        </div>
      </div>
    );
  }
}

export default StatsCard;
