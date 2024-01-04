FROM node:14

WORKDIR C:/Users/Asus/Downloads/todofront/todofront

COPY package*.json ./

RUN npm install

COPY . .

EXPOSE 8082

CMD ["npm", "run", "serve"]
