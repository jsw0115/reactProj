import logo from './logo.svg';
import './App.css';
import React, { useState, useEffect } from 'react';
import axios from 'axios';

function App() {

    // react 2024.10.09 fetch() 이용한 서버 통신
    /*

    const [message, setMessage] = useState([]);

    useEffect(() => {
        fetch("/api/demo-web")
            .then((response) => {
                return response.json();
            })
            .then((data) => {
                setMessage(data);
            });
    }, []);
    */

    const [currentTime, setCurrentTime] = useState('');

    useEffect(() => {
        // /api/time 엔드포인트로 GET 요청을 보냄
        axios.get('http://localhost:8080/api/time')
            .then(response => {
            setCurrentTime(response.data);
            })
            .catch(error => {
            console.error('API 호출 중 오류 발생:', error);
            });
      }, []); // 빈 배열을 전달하여 컴포넌트가 처음 마운트될 때만 실행


    return (
        <div className="App">
            <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />
            <p>
                Edit <code>src/App.js</code> and save to reload.
            </p>
                <a className="App-link"
                    href="https://reactjs.org"
                    target="_blank"
                    rel="noopener noreferrer">
                    Learn React
                </a>
            </header>
        </div>
    );
}

export default App;
