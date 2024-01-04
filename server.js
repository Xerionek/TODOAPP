const express = require('express');
const fs = require('fs');
const path = require('path');

const app = express();
const port = 3000;

app.use(express.json());

app.get('/readJson', (req, res) => {
  const filePath = path.join('users.json');

  fs.readFile(filePath, 'utf8', (err, data) => {
    if (err) {
      console.error('Error reading JSON file:', err);
      res.status(500).send('Error reading JSON file');
      return;
    }

    res.json(JSON.parse(data));
  });
});

app.post('/writeJson', (req, res) => {
  const filePath = path.join(__dirname, 'data.json');
  const jsonData = JSON.stringify(req.body, null, 2);

  fs.writeFile(filePath, jsonData, 'utf8', (err) => {
    if (err) {
      console.error('Error writing to JSON file:', err);
      res.status(500).send('Error writing to JSON file');
      return;
    }

    res.send('JSON file updated successfully');
  });
});

app.listen(port, () => {
  console.log(`Server is running on http://localhost:${port}`);
});