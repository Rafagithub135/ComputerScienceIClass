(function () {
    let emessage = {};
    for (i = 0; i < message.length; i++) {
        do (emessage[i] = message[i]);
        while (i < message.length);
        if (randomSelector == 1) {
            emessage.append("h");
            for (j = 1; j <= hour; j++) {
                emessage.append(randomCharacters[(Math.random() * hour)]);
            }
        } else {
            emessage.append("m");
            for (j = 1; j <= minute; j++) {
                emessage.append(randomCharacters[(Math.random() * minute)]);
            }
        }
    }
});