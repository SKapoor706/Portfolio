
var friends = {
    bill: {
        firstName: "Bill",
        lastName: "Bob",
        number: "(911) 765-4321",
        address: ['123 Fake Street', 'Fake Town', 'FS', '12345']
    },
    steve: {
        firstName: "Steve",
        lastName: "Bob",
        number: "(911) 123-4567",
        address: ['111 Fake Street', 'Fake Town', 'FS', '12345']
    },
};

var list = function(friends){
    for(var key in friends){
      console.log(key);  
    };
};

var search = function(name){
    for(var key in friends){
        if(friends[key].firstName === name){
          console.log(friends[key]);
          return friends[key];
        };
    };
};