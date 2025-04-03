# Collections
Une collection est un regroupement d'objets qui sont désignés sous le nom d'éléments.<br>
L'API Collections propose un ensemble d'interfaces et de classes dont le but est de stocker de multiples objets. Elle propose quatre grandes familles de collections, chacune définie par une interface de base :

* **List** : collection d'éléments ordonnés qui accepte les doublons
* **Set** : collection d'éléments non ordonnés par défaut qui n'accepte pas les doublons
* **Map** : collection sous la forme d'une association de paires clé/valeur
* **Queue et Deque** : collections qui stockent des éléments dans un certain ordre avant qu'ils ne soient extraits pour traitement <br>


Collection Interface Hierarchie
![Collections- Framework Heararchy](https://miro.medium.com/v2/resize:fit:1400/1*2hgLstie4gxpXUUzgAkGgg.png)
source image link: https://levelup.gitconnected.com/java-collections-framework-class-hierarchy-latest-2024-51f9154f1f57 
## Collections avec Doublons (List)
Une liste est une collection ordonnée (parfois appelée séquence). Les listes peuvent contenir des éléments en double. Les éléments peuvent être insérés ou consultés en fonction de leur position dans la liste, à l'aide d'un index basé sur zéro. Les classes qui implémentent l'interface List sont les suivantes :
- ArrayList
- LinkedList
- Vector
- Stack

### ArrayList
    ArrayList, presesnte depuis Java 1.2, est une alternative populaire aux tableaux en Java.
    Elle est basée sur une structure de données de type tableau.
    ArrayList est une implémentation de l'interface List sous forme de tableau redimensionnable. 
    Il implémente toutes les opérations de liste optionnelles et autorise tous les éléments, y compris null.

### LinkedList
    La classe LinkedList, presesnte depuis Java 1.2, est une structure de données linéaire.
    Elle Une implémentation d'une liste doublement chaînée dans laquelle les éléments de la collection sont reliés par des pointeurs.
    La suppression ou l'ajout d'un élément se fait simplement en modifiant des pointeurs. 
    Chaque élément de la liste contient une référence (adresse/pointeur) à l'élément suivant de la liste.
### Vector
    La classe Vector, présente depuis Java 1.0, est un tableau dont la taille peut varier selon le nombre d'éléments qu'il contient.
    Lors de la création d'une instance de type Vector, il est possible de lui préciser une capacité initiale et une taille d'incrémentation en utilisant la surcharge correspondante du constructeur.
    Toutes les méthodes de la classe Vector sont synchronized : elle est donc moins performante que la classe ArrayList car elle est thread-safe.
    
### Stack
    La classe Stack étend la classe Vector, ce qui signifie qu'elle est une sous-classe de Vector. 
    La pile fonctionne selon le concept du dernier entré, premier sorti (LIFO). 
    Les éléments sont insérés à l'aide de la méthode push() à la fin de la pile, la méthode pop() supprime l'élément qui a été inséré en dernier dans la pile.
    Elle existe depuis Java 1.2.
## Collections sans Doublons (Set)
Une collection de type Set ne permet pas l'ajout de doublons ni l'accès direct à un élément de la collection. Les fonctionnalités de base de ce type de collection sont définies dans l'interface java.util.Set. 

Il y a trois implementations principales de l'interface Set qui sont: 
- HashSet,
- LinkedHashSet.
- TreeSet,
### HashSet
    La classe HashSet, ajoutée à Java 1.2, est une implémentation simple de l'interface Set qui utilise une HashMap. HashSet n'authorise que des elements uniques.
    Il ne conserve pas forcement l'ordre d'insertion d'un élément, ce qui signifie qu'un inséré en dernier
    peut apparaître en premier quand on parcours le HashSet.
### LinkedHashSet
    Contrairement a HashSet, LinkedHashSet conserve l'ordre d'insertion des éléments.
### TreeSet
    La classe TreeSet, ajoutée à Java 1.2, stocke ses éléments de manière ordonnée en les comparant entre-eux.
    Cette classe permet d'insérer des éléments dans n'importe quel ordre et de restituer ces éléments dans un ordre précis lors de son parcours.
    Une collection de type TreeSet ne peut pas contenir de doublons.
## Dictionnaires (Map)
Les collections de type Map sont définies et implémentées comme des dictionnaires sous la forme d'associations de paires de type clés/valeurs. La clé doit être unique. En revanche, la même valeur peut être associée à plusieurs clés différentes. Il y a trois implémentations principale de l'interface Map: 
- HashMap,
- TreeMap,
- LinkedHashMap.
### HashMap
    La classe HashMap, ajoutée à Java 1.2, est une implémentation de l'interface Map qui utilise une Hashtable. 
    La classe HashMap est similaire à la classe Hashtable sauf qu'elle n'est pas synchronized et qu'elle autorise l'utilisation de la valeur null.
### TreeMap
    La classe TreeMap, ajoutée à Java 1.2, est une Map qui stocke des éléments de manière triée dans un arbre de type rouge-noir (Red-black tree).
    Les éléments de la collection sont triés selon l'ordre naturel de leur clé (s'is implémentent l'interface Comparable) ou en utilisant une instance de type Comparator fournie au constructeur de la collection.
    Elle implémente les interfaces Map et SortedMap. Elle implémente aussi l'interface NavigableMap depuis Java 6.

### LinkedHashMap
    La classe LinkedHashMap, ajoutée à Java 1.4, est une implémentation de type Map qui utilise une liste doublement chaînée pour maintenir par défaut ses éléments dans leur ordre d'insertion.

# Tableau Recap
Collection | Ordonné | Accès direct | Clé / valeur | Doublons | Null | Thread Safe |
---------- |---------|--------------|--------------|----------|------|-------------|
ArrayList  | Oui     | Oui          | Non          | Oui      | Oui  | Non         | 
LinkedList | Oui     | Non          | Non          | Oui      | Oui  | Non         |
HashSet    | Non     | Non          | Non          | Non      | Oui  | Non         |
TreeSet    | Oui     | Non          | Non          | Non      | Non  | Non         |
HashMap    | Non     | Oui          | Oui          | Non      | Oui  | Non         |
TreeMap    | Oui     | Oui          | Oui          | Non      | Non  | Non         |
Vector     | Oui     | Oui          | Non          | Oui      | Oui  | Oui         |
Hashtable  | Non     | Oui          | Oui          | Non      | Non  | Oui         |
Properties | Non     | Oui          | Oui          | Non      | Non  | Oui         |
Stack      | Oui     | Non          | Non          | Oui      | Oui  | Oui         |
CopyOnWriteArrayList| Oui     | Oui          | Non          | Oui      | Oui  | Oui         |
ConcurrentHashMap | Non     | Oui          | Oui          | Non      | Non  | Oui         |
CopyOnWriteArraySet| Non     | Non          | Non          | Non      | Oui  | Oui         |


# Webographie
- https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collection.html ;
- https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Collections.html ;
- https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/ArrayList.html
- https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/util/Vector.html
- https://www.jmdoudoux.fr/java/dej/indexavecframes.htm
- https://beginnersbook.com/java-collections-tutorials/
- https://openclassrooms.com/fr/courses/8383791-apprenez-a-programmer-en-java-1/8441614-rassemblez-vos-donnees-a-laide-des-collections