package mega.GRE.Preparation;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Top500to1000wordslist extends ListActivity {

    private TextView text;

    private List<String> listValues;



    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_top500to1000wordslist);



        text = (TextView) findViewById(R.id.first2);



        listValues = new ArrayList<String>();

        listValues.add("SERRATED: having a saw toothed edge");
        listValues.add("NOSTRUM: questionable medicine");

        listValues.add("FURTIVE: stealthy, sneaky");
        listValues.add("APPREHENSIVE: fearful");
        listValues.add("TENACITY: firmness,persistence");
        listValues.add("REBUFF: beat back, unfriendly answer");

        listValues.add("INVEIGLE: lead artsay, wheadle");
        listValues.add("SWERVE: Deviate, turn aside sharply");
        listValues.add("PITHY: Concise, meaningful,substantial");
        listValues.add("INSCRUTABLE: impenetrable,mysterious");

        listValues.add("ADAMANT: hard, inflexible");
        listValues.add("SUPPRESS: overwhelm, subdue, inhibit");
        listValues.add("SLUGGARD: lazy person");
        listValues.add("PARODY: humorous imitation");

        listValues.add("STICKLER: perfectionist");
        listValues.add("INELUCTABLE: irresistable, not to be escaped ");
        listValues.add("OSTENSIBLE: Apparent, pretended");
        listValues.add("GOURMAND: person who takes excessive pleasure in food and drink");

        listValues.add("FEINT: Shift, trick");
        listValues.add("AUSPICIOUS: favouring success");
        listValues.add("FERRET: drive or hunt out of hiding");
        listValues.add("INCIPIENT: beginning, in an party stage");

        listValues.add("FRACAS: brawl, melee");
        listValues.add("DISCRETION: Prudence");
        listValues.add("SODDEN: Soaked, Dull, very wet and heavy");
        listValues.add("PERUSE: Read with care");

        listValues.add("INDOMITABLE: unconquerable,unyielding");
        listValues.add("CULPABLE: deserving blame, Culprit");
        listValues.add("VINDICTIVE: out for revenge, malicious");
        listValues.add("PROPITIOUS: favorable, fortunate,advantageous");

        listValues.add("NEOLOGISM: new or newly coined word or phrase");
        listValues.add("UNTOWARD: unfortunate or unlucky, adverse. unexpected");
        listValues.add("PRODIGIOUS: marvelous, enormous");
        listValues.add("MYRIAD: very large number");

        listValues.add("CENSURE: Blame, criticize");
        listValues.add("TRAVESTY: parody, harshly distorted imitation");
        listValues.add("SPARSE: Not thick,thinly scattered");
        listValues.add("PLUMB: Vertical");

        listValues.add("STOIC: impassive, unmoved by joy or grief");
        listValues.add("JUDICIOUS: wise");
        listValues.add("PETRIFY: turn to stone");
        listValues.add("INDULGENT: humouring, yielding");

        listValues.add("ELOQUENCE: expressiveness, persuasive speech");
        listValues.add("DILATE: expand");
        listValues.add("HERESY: opinion contrary to popular belief");
        listValues.add("INTREPID: fearless");

        listValues.add("IMPLICATE: show to be involved");
        listValues.add("EDDY: swirling current of water");
        listValues.add("REGICIDE: murder of a king or queen");
        listValues.add("INTERIM: meantime");

        listValues.add("ECCENTRIC: irregular, odd, whimsical");
        listValues.add("APOSTATE: one who abandons his religious faith or political beliefs");
        listValues.add("UNCOUTH: clumsy, boorish");
        listValues.add("RECAST: reconstruct, fashion again");

        listValues.add("HIRSUTE: Hairy");
        listValues.add("UBIQUITOUS: Being everywhere, omnipresent");
        listValues.add("QUERY: question, enquiry");
        listValues.add("FORBEARANCE: patience");

        listValues.add("ABET: encourage,assist");
        listValues.add("TURPITUDE: depravity");
        listValues.add("RHETORIC: art of effective communication");
        listValues.add("OSSIFY: change or harden into bone");

        listValues.add("SPLICE: fasten together, unite");
        listValues.add("FOIL: contrast");
        listValues.add("MARTIAL: warlike");
        listValues.add("ENTREAT: plead, ask earnestly");

        listValues.add("COUNTENANCE:face ");
        listValues.add("BLANDISHMENT: flattery");
        listValues.add("CRASS: very unrefined, grossly insensible");
        listValues.add("EXTANT: still in existence");

        listValues.add("DESCRY: catch right of");
        listValues.add("BOGUS: not authentic");
        listValues.add("BELABOR: Go over excessively or to a ridiculous degree");
        listValues.add("EXPLOIT: dead or action");

        listValues.add("FRET: be annoyed or vexed");
        listValues.add("EGRESS; exit");
        listValues.add("AVOW: declare openly");
        listValues.add("BLATANT: extremely obvious, loudly offensive");

        listValues.add("FORSWEAR: renounce, abandon");
        listValues.add("MOLT: shed or cast off hair or feathers");
        listValues.add("GLOAT: express evil satisfaction");
        listValues.add("SATURNINE: gloomy, sad");

        listValues.add("MULTIFARIOUS: greatly diversified");
        listValues.add("RAVE: favourable review");
        listValues.add("SPURN: reject");
        listValues.add("APLOMB: assurance, poise");

        listValues.add("INTERDICT: prohibit, forbid");
        listValues.add("PIQUE: irritation, resentment");
        listValues.add("TEMPERATE: self-controlled,moderate with temperature");
        listValues.add("INVINCIBLE: unconquered");

        listValues.add("PITH: core or marrow, essence");
        listValues.add("TORQUE: twisting force");
        listValues.add("ARROGANCE: pride, haughtiness");
        listValues.add("FIDELITY: loyalty");

        listValues.add("LIEN: legal claim on a property");
        listValues.add("PLAINTIVE: mournful");
        listValues.add("COGITATE: think over");
        listValues.add("FOIBLE: weakness");

        listValues.add("IRREVOCABLE: irreversible, unalterable");
        listValues.add("DIDACTIC: teaching , instructional");
        listValues.add("AUXILIARY: offering or providing help");
        listValues.add("CONGEAL: freeze");

        listValues.add("INCLINED: tending or leaning toward, bent");
        listValues.add("PLUCK: courage");
        listValues.add("LIONIZE: treat as a celebrity");
        listValues.add("TEMERITY: boldness, rashness");

        listValues.add("PROSAIC: dull and unimaginative, factual");
        listValues.add("SPURIOUS: false, illogical, counterfeit");
        listValues.add("TOADY: servile flatterer, yes man");
        listValues.add("ASCRIBE: refer, assign");

        listValues.add("LUGUBRIOUS: Mournful");
        listValues.add("RENEGE: deny");
        listValues.add("TOUT: publicize, praise excessively");
        listValues.add("PERPETRATE: commit an offense");

        listValues.add("SMOLDER: burn without flame");
        listValues.add("VERDANT: green, lush in vegetation");
        listValues.add("AUGURY: omen, prophecy");
        listValues.add("IMMINENT: neat at hand, impending");

        listValues.add("PIED: multicolored");
        listValues.add("SOPHISTICATED: rise an urbane, complex");
        listValues.add("PUNDIT: authority on a subject, expert");
        listValues.add("INCESSANT: uninterrupted");

        listValues.add("CONSUMMATE: complete");
        listValues.add("ALCOVE: nook, recess");
        listValues.add("VENAL: capable of being bribed" );
        listValues.add("PROLIFIC: abundantly fruitful");

        listValues.add("ILLICIT: illegal");
        listValues.add("TRANSIENT: momentary, temporary");
        listValues.add("PRESCIENCE: ability to foretell the future");
        listValues.add("FLINCH: hesitate, shrink");

        listValues.add("ACUMEN: mental keenness");
        listValues.add("SUPINE: lying on back");
        listValues.add("RETROSPECTIVE: looking back on the past");
        listValues.add("NOXIOUS: harmful");

        listValues.add("SIMPER: smile affectedly");
        listValues.add("FELON: person convicted of a grave crime");
        listValues.add("NOISOME: foul-smelling");
        listValues.add("DEFIANCE: referal to yield, resistance");

        listValues.add("BEDIZEN: dress with vulgar finery");
        listValues.add("ASSAIL: arrant");
        listValues.add("BELLICOSE: warlike");
        listValues.add("EQUIPOISE: balance, equilibrium");

        listValues.add("CLAMOR: Noise");
        listValues.add("BALEFUL: deadly, having a malign influence");
        listValues.add("RESTIVE: restlessly impatient");
        listValues.add("PALATIAL: magnificent");

        listValues.add("DOLT: stupid person");
        listValues.add("ANIMOSITY: active enmity");
        listValues.add("TURGID: swollen, distended");
        listValues.add("RENOVATE: renew, restore to good condition");

        listValues.add("MORBID: moody, characteristic of disease");
        listValues.add("SUCCINCT: compact, brief");
        listValues.add("RENDER: deliver, provide, represent");
        listValues.add("MERCURIAL: capricious, unpredictable, changing");

        listValues.add("AMENABLE: readily managed, answerable or accountable legally");
        listValues.add("STUPEFY: make numb, stun, amaze");
        listValues.add("RIFT: opening, break");
        listValues.add("PONDEROUS: weighty, unwieldy");

        listValues.add("SEVER: cut, separate");
        listValues.add("LUMINARY: celebrity");
        listValues.add("PEDAGOGY: teaching");
        listValues.add("DUBIOUS: questionable, filled with doubt");

        listValues.add("CALUMNY: malicious misinterpretation");
        listValues.add("BLITHE: joyous, gay");
        listValues.add("DISDAIN: view with scorn of contempt");
        listValues.add("ENIGMATIC: puzzling");

        listValues.add("DIVULGE: reveal");
        listValues.add("CAJOLE: coax");
        listValues.add("QUANDARY: dilemma");
        listValues.add("FINICKY: too particular, funny");

        listValues.add("CORPOREAL: bodily, material");
        listValues.add("ADORN: decorate");
        listValues.add("WAFFLE: speak equivocally about an hour");
        listValues.add("PIOUS: religious, devout");

        listValues.add("EXTENUATE: weaken, mitigate");
        listValues.add("VARIEGATED: many-colored");
        listValues.add("NEXUS: connection");
        listValues.add("EMOLLIENT: soothing or softening remedy");

        listValues.add("ABUT: border upon, adjoin");
        listValues.add("SOLVENT: able to pay all debts");
        listValues.add("QUOTIDIAN: daily, common place, customary");
        listValues.add("LAVISH: liberal, wasteful");

        listValues.add("SINUOUS: winding, not morally honest");
        listValues.add("CRYPTIC: mysterious, hidden, secret");
        listValues.add("HEGEMONY: dominance, especially of one nation over others");
        listValues.add("COUNTENANCE: face, approve, tolerate");

        listValues.add("BALK: stop short, as if faced with an obstacle and refuse to continue");
        listValues.add("ANGUISH: acute pain, extreme suffering");
        listValues.add("CONCEIT: vanity or self love");
        listValues.add("AVOCATION: secondary or minor occupation");

        listValues.add("CONSEQUENTIAL: pompous, self-important");
        listValues.add("AVARICE: greediness for wealth");
        listValues.add("PREVALENT: widespread, generally accepted");
        listValues.add("LACKLUSTER: dull");

        listValues.add("EXTOL: praise, glorify");
        listValues.add("BOISTEROUS: violent, rough, noisy");
        listValues.add("THWART: baffle, frustrate");
        listValues.add("PERSONABLE: attractive");

        listValues.add("INCULCATE: teach");
        listValues.add("SHUN: keep away from , banish");
        listValues.add("ODIOUS: hateful");
        listValues.add("INANE: silly, senseless");

        listValues.add("BARRAGE: bombardment");
        listValues.add("REQUITE: repay, revenge");
        listValues.add("QUACK: impostor");
        listValues.add("NADIR: lowest point");

        listValues.add("REPEL: drive away, disgust");
        listValues.add("IMPIETY: irreverence, lack of respect for God ");
        listValues.add("LUMBER: move heavily or clumsily");
        listValues.add("FETTER: shackle");

        listValues.add("DEMUR: object, hesitate");
        listValues.add("COLLUSION: conspiring in a fraudulent scheme");
        listValues.add("DOGGEREL: poor verse");
        listValues.add("GERMANE: pertinent, bearing upon the care at hand");

        listValues.add("ENDORSE: approve, support");
        listValues.add("QUIAL: cover, lose heart");
        listValues.add("LIBERTINE: debauched person");
        listValues.add("ESPOUSE: adapt, support");

        listValues.add("AFFINITY: kinship, a strong feeling of liking someone");
        listValues.add("VAGARY: erratic, unpredictable occurrence");
        listValues.add("PRETERNATURAL: beyond that which is normal in nature");
        listValues.add("INDIFFERENT: unmoved or unconcerned, mediocre");

        listValues.add("SKIFF: small, light sailboat");
        listValues.add("POLEMICAL: aggressive in verbal attack");
        listValues.add("INCITE: good, motivate , induce to exist");
        listValues.add("ACCRUE: came about by addition");

        listValues.add("SERVILE: slavish");
        listValues.add("QUIXOTIC: idealistic but impractical");
        listValues.add("OPAQUE: dark");
        listValues.add("SEDULOUS: diligent");

        listValues.add("IMPERATIVE: absolutely necessary");
        listValues.add("LUSTROUS: shinning");
        listValues.add("FALTER: hesitate");
        listValues.add("DEBACLE: sudden downfall, complete disaster");

        listValues.add("ALCHEMY: medieval chemistry");
        listValues.add("DEPOSITION: testimony under oath");
        listValues.add("FOIL: contrast, defeat, frustrate");
        listValues.add("DISCONCERT: confuse, upset");

        listValues.add("CONTUMACIOUS: disobedient");
        listValues.add("TIMOROUS: fearful, demonstrating fear");
        listValues.add("INDIGENOUS: native");
        listValues.add("DENOUEMENT: outcome");

        listValues.add("ASTUTE: wise,keen,shrewd");
        listValues.add("VOLUBLE: fluent, talkative");
        listValues.add("SPENDTHRIFT: someone who wastes money");
        listValues.add("INCREDULOUS: skeptical, unbelievable");

        listValues.add("VIVACIOUS: lively or animated, sprightly");
        listValues.add("RIDDLE: pierce with holes");
        listValues.add("HONE: sharpen");
        listValues.add("ABERRATION: deviation from expected or normal");

        listValues.add("VEER: change in direction");
        listValues.add("UMBRAGE: anger, sense of injury or insult");
        listValues.add("OBLIVIOUS: inattentive, unmindful");
        listValues.add("UNDERMINE: weaken");

        listValues.add("FOSTER: rear, encourage");
        listValues.add("JIBE: agree");
        listValues.add("DRONE: idle person, maLe bee");
        listValues.add("CONCORD: harmony");

        listValues.add("CANON: collection or authoritative list of books");
        listValues.add("CORDON: a line of police officers");
        listValues.add("FLAMBOYANT: ornate");
        listValues.add("DELUGE: flood, rush");

        listValues.add("CUDDLE: treat gently, pamper");
        listValues.add("PREPONDERANCE: superiority of power, quantity");
        listValues.add("JOCULAR: joking");
        listValues.add("ENNUI: boredom");

        listValues.add("BEREFT: deprived of, lacking");
        listValues.add("SURFEIT: satiate, stuff, indulge to excess in anything");
        listValues.add("PRATTLE: babble");
        listValues.add("IMPUNITY: freedom from punishment or harm");

        listValues.add("STANCH: check flow of blood");
        listValues.add("PIQUE: annoy");
        listValues.add("HOAX: trick, practical joke");
        listValues.add("ARGOT: stang");

        listValues.add("SOLVENT: substance that dissolves another");
        listValues.add("PROVISIONAL: tentative");
        listValues.add("PALLIATE: ease pain, make less severe or offensive");
        listValues.add("SECULAR: temporal");

        listValues.add("FRANTIC: wild");
        listValues.add("NEBULOUS: hazy, cloudy, unclear");
        listValues.add("FERVENT: ardent, hot");
        listValues.add("DEFER: delay till later");

        listValues.add("BREACH: breaking of contract");
        listValues.add("DRONE: talk dully or boring");
        listValues.add("FERVID: ardent");
        listValues.add("ENMITY: hatred");

        listValues.add("COEVAL: contemporary");
        listValues.add("SUMPTUOUS: lavish, rich");
        listValues.add("PROCLIVITY: inclination, natural tendency");
        listValues.add("GLIB: fluent, slick");

        listValues.add("COVERT: secret, hidden");
        listValues.add("VISCERAL: felt in ones inner organs");
        listValues.add("SUBLIME: noble and uplifting feelings");
        listValues.add("PORTENT: sign, amen, forewarning");

        listValues.add("UNEARTH: dig up");
        listValues.add("SCURVY: despicable or hate");
        listValues.add("INDELIBLE: not able to be erased");
        listValues.add("CONSOLE: give comfort or sympathy");

        listValues.add("TURBULENCE: state of violent agitation");
        listValues.add("SUPERFLUOUS: excessive, overabundant");
        listValues.add("REFULGENT: brightly shining, gleaming");
        listValues.add("SYCOPHANT: servile flatterer");

        listValues.add("IMPERIOUS: domineering");
        listValues.add("PRUNE: cut away, trim");
        listValues.add("IGNOBLE: unworthy, not noble");
        listValues.add("FACILE: easily accomplished, superficial");

        listValues.add("DISCOURSE: formal discussion, conversation");
        listValues.add("FOPPISH: vain about dress and appearance");
        listValues.add("IMMACULATE: spotless, flawless, absolutely clean");
        listValues.add("FORD: place where a river can be crossed on foot");

        listValues.add("DROLL: queer amd amusing");
        listValues.add("SALACIOUS: lustful, showing too much interest in sex");
        listValues.add("PALPITATE: tremble");
        listValues.add("HACKNEYED: commonplace");

        listValues.add("ASCERTAIN: find out for certain");
        listValues.add("WRIT: written command issued by court");
        listValues.add("RAPACIOUS: excessively grasping");
        listValues.add("LURK: stealthily lie in waiting");

        listValues.add("VERVE: enthusiasm");
        listValues.add("RANT: scold");
        listValues.add("INVETERATE: deep rooted, habitual");
        listValues.add("AMBIDEXTROUS: capable of using either hand with equal ease");

        listValues.add("STIPPLE: point or draw with dots");
        listValues.add("SANGUINE: cheerful");
        listValues.add("PROFLIGATE: wasteful");
        listValues.add("SOPHISTRY: fallacious reasoning generally to deceive people");

        listValues.add("IMPROMPTU: without previous preparation");
        listValues.add("PECCADILLO: slight offense");
        listValues.add("IMBROGLIO: complicated situation, confused man");
        listValues.add("DEARTH: scarcity");

        listValues.add("AXIOM: self evident truth, requiring no proof");
        listValues.add("DURESS: forcible restraint, illegal threats");
        listValues.add("IMPENDING: approaching, nearing");
        listValues.add("FETID: having a strong  bad smell");

        listValues.add("BRAZEN: one how is not embarrassed about doing something wrong");
        listValues.add("SLUR: insult to one;s character or reputation");
        listValues.add("LIMN: draw, outline, describe");
        listValues.add("GOSSAMER: delicate substance");

        listValues.add("CHISEL: cheat");
        listValues.add("VIRULENT: hostile, bitter");
        listValues.add("REACTIONARY: opposing progress, politically ultraconservative");
        listValues.add("LACHRYMOSE: producing tears");

        listValues.add("VESTIGE: trace, remains");
        listValues.add("RAMIFY: divide into branches or sub-division");
        listValues.add("INCENSE: enrage, infuriate");
        listValues.add("AUGUST: impressive, majestic");

        listValues.add("ULTERIOR: unstated");
        listValues.add("STENTORIAN: extremely loud");
        listValues.add("OBSTINATE: stubborn, hard to control or treat");
        listValues.add("TRITE: hackneyed, common");

        listValues.add("IMPECUNIOUS: without money");
        listValues.add("MAUDLIN: sentimental");
        listValues.add("GROVEL: crawl or creep on ground");
        listValues.add("DISLODGE: remove forcibly");

        listValues.add("COMMODIOUS: spacious and comfortable");
        listValues.add("EXUBERANCE: overflowing abundance, joyful");
        listValues.add("HERMETIC: airtight and sealed");
        listValues.add("GLIMMER: shine erratically, twinkle");

        listValues.add("CURTAIL: shorten, reduce");
        listValues.add("PRIM: very precise and formal");
        listValues.add("INVEIGH: to criticize someone");
        listValues.add("EQUIVOCAL: ambiguous, intentionally misleading");

        listValues.add("ARCHAIC: old fashioned");
        listValues.add("WEAN: give up a cherished activity");
        listValues.add("PEREMPTORY: demanding and leaving no choice");
        listValues.add("HEINOUS: hatefully bad");

        listValues.add("WAFT: moved gently by wind or leaves");
        listValues.add("OVERWEENING: arrogant");
        listValues.add("GORGE: stuff oneself");
        listValues.add("ABYSMAL: bottomless, very bad quality");

        listValues.add("TRIFLING: unimportant");
        listValues.add("QUIRK: startling twist");
        listValues.add("NUGATORY: worthless");
        listValues.add("SYNTHESIS: combining parts into a whole");

        listValues.add("EXTIRPATE: to get rid of completely");
        listValues.add("MERETRICIOUS: cheap");
        listValues.add("EXORBITANT: excessive");
        listValues.add("CONNOTATION: suggested or implied meaning of an expression");

        listValues.add("ASTRINGENT: binding, harsh or severe");
        listValues.add("CONVICTION: strongly held belief");
        listValues.add("EXTEMPORANEOUS: not planned, impromptu");
        listValues.add("DISCOMFIT: defeat");

        listValues.add("CABAL: small group of people secretly unitedto promote their own interests");
        listValues.add("FLUSTER: confuse");
        listValues.add("DISINTER: dig up, unearth");
        listValues.add("ARDOR: heat, passion");

        listValues.add("TRENCHANT: forceful and vigorous, cutting");
        listValues.add("PERJURY: false testimony while under earth");
        listValues.add("EXPURGATE: clean, remove offensive parts of a book");
        listValues.add("TERSE: concise, abrupt");

        listValues.add("METTLE: courage, spirit");
        listValues.add("EVOKE: call forth, provoke");
        listValues.add("ADULATION: flattery, admiration");
        listValues.add("STATIC: unchanging, still");

        listValues.add("SQUANDER: waste");
        listValues.add("HEW: cut to pieces with or sword");
        listValues.add("SQUAT: short and thick");
        listValues.add("EPITOME: perfect example or embodiment");

        listValues.add("GLUT: overstock, exam");
        listValues.add("DISTRAUGHT: upset");
        listValues.add("BENEFACTOR: gift giver, patron");
        listValues.add("ARTICULATE: effective, distinct");

        listValues.add("CHARY: cautious");
        listValues.add("ENDURING: lasting, surviving");
        listValues.add("CUMBERSOME: hard to manage");
        listValues.add("AVID: greedy");

        listValues.add("PALATE: sense of taste");
        listValues.add("IMPRECATION: curse");
        listValues.add("DULCET: sweet sounding");
        listValues.add("BUCOLIC: pastoral");

        listValues.add("UNFEIGNED: genuine, real");
        listValues.add("PAEAN: song of praise or joy");
        listValues.add("IMPEDIMENT: hindrance");
        listValues.add("TURBID: muddy");

        listValues.add("MALAPROPISM: comic misuse of a word");
        listValues.add("HOODWINK: deceive, delude");
        listValues.add("AVERSION: firm dislike");
        listValues.add("TAUT: tight, ready");

        listValues.add("PLUMB:measure depth ");
        listValues.add("KNIT: grow together");
        listValues.add("SETENTIOUS: telling people how they should behave");
        listValues.add("FORTUITOUS: accidental");

        listValues.add("INSOUCIANT: indifferent");
        listValues.add("ENCOMIUM: high praise");
        listValues.add("CONTIGUOUS: touching upon");
        listValues.add("BUOYANT: able to float");

        listValues.add("CURMUDGEON: often annoyed person");
        listValues.add("EVANESCENT: vanishing, fleeting");
        listValues.add("DETRACTION: slandering, aspersion");
        listValues.add("COLANDER: utensil with perforated bottom ");

        listValues.add("SUCCOR: aid, assist");
        listValues.add("INIMITABLE: matchless");
        listValues.add("ERRATIC: add, unpredictable");
        listValues.add("ALLEGIANCE: loyalty");

        listValues.add("URBANE: refined");
        listValues.add("SOBRIETY: seriousness");
        listValues.add("HALCYON: calm, peaceful");
        listValues.add("TYRO: beginner");

        listValues.add("SERE: parched");
        listValues.add("FULMINATE: thunder");
        listValues.add("AGOG: highly excited");
        listValues.add("TEPID: lukewarm");

        listValues.add("SUNDRY: various, several");
        listValues.add("SATIRE: sarcasm");
        listValues.add("SUPPLANT: replace");
        listValues.add("FLORID: reddish");

        listValues.add("INSURRECTION: rebellion");
        listValues.add("EXONERATE: exculpate");
        listValues.add("COVETOUS: eagerly desirous of");
        listValues.add("ASPERITY: sharpness");

        listValues.add("DECRY: express strong disapproval of");
        listValues.add("EXPEDIENT: suitable, practical");
        listValues.add("DISSENT: disagree");
        listValues.add("CORDIAL: gracious");

        listValues.add("RAZE: destroy completely");
        listValues.add("LONGEVITY: long life");
        listValues.add("BUREAUCRACY: over-regulated administrative");
        listValues.add("ARCHETYPE: prototype");

        listValues.add("VINDICATE: clear from blame");
        listValues.add("QUISLING: traitors who aids invaders");
        listValues.add("LEAVEN: cause to rise or grow lighter");
        listValues.add("TRAVERSE: go through");

        listValues.add("PROSODY: the art of verification");
        listValues.add("EMBOSS: produce a design in raised belief");
        listValues.add("ARABLE: fit for growing crops");
        listValues.add("STRIDENT: loud and harsh");

        listValues.add("PARAMOUNT: supreme in importance");


        // initiate the listadapter

        ArrayAdapter<String> myAdapter = new ArrayAdapter <String>(this,

                R.layout.row_layoutlist, R.id.listText, listValues);



        // assign the list adapter

        setListAdapter(myAdapter);



    }



    // when an item of the list is clicked

    @Override

    protected void onListItemClick(ListView list, View view, int position, long id) {

        super.onListItemClick(list, view, position, id);



        String selectedItem = (String) getListView().getItemAtPosition(position);

        //String selectedItem = (String) getListAdapter().getItem(position);
        int pos=position;

        if(pos==0) {

            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==1){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");


        }
        else if(pos==2){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");


        }
        else if(pos==3){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");


        }
        else if(pos==4){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");


        }
        else if(pos==5){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");


        }
        else if(pos==6){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==7){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==8){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==9){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==10){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==11){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==12){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==13){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==14){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==15){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==16){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==17){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==18){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==19){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==20){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==21){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==22){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==23){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==24){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==25){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==26){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==27){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==28){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==29){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==30){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==31){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==32){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==33){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==34){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==35){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");

        }
        else if(pos==36){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==37){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==38){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==39){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==40){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==41){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==42){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==43){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==44){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==45){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==46){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==47){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==48){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==49){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==50){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==51){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==52){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==53){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==54){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==55){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==56){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==57){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==58){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==59){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==60){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==61){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==62){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==63){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==64){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==65){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==66){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==67){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==68){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==69){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==70){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==71){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==72){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==73){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==74){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==75){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==76){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==77){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==78){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==79){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==80){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==81){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==82){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==83){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==84){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==85){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==86){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==87){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==88){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==89){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==90){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==91){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==92){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==93){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==94){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==95){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==96){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==97){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==98){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==99){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==100){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==101){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==102){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==103){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==104){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==105){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==106){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==107){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==108){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==109){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==110){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==111){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==112){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==112){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==113){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==114){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==115){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==116){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==117){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==118){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==119){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==120){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==121){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==122){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==123){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==124){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==125){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==126){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==127){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==128){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==129){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==130){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==131){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==132){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==133){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==134){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==135){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==136){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==137){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==138){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==139){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==140){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==141){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==142){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==143){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==144){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==145){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==146){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==147){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==148){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==149){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==150){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==151){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==152){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==153){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==154){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==155){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==156){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==157){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==158){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==159){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==160){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==161){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==162){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==163){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==164){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==165){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==166){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==167){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==168){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==169){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==170){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==171){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==172){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==173){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==174){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==175){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==176){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==177){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==178){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==179){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==180){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==181){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==182){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==183){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==184){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==185){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==186){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==187){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==188){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==189){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==190){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==191){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==192){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==193){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==194){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==195){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==196){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==197){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==198){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==199){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==200){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==201){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==202){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==203){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==204){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==205){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==206){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==207){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==208){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==209){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==210){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==211){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==212){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==213){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==214){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==215){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==216){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==217){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==218){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==219){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==220){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==221){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==222){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==223){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==224){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==225){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==226){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==227){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==228){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==229){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==230){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==231){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==232){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==233){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==234){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==235){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==236){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==237){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==238){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==239){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==240){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==241){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==242){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==243){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==244){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==245){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==246){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==247){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==248){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==249){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==250){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==251){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==252){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==253){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==254){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==255){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==256){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==257){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==258){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==259){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==260){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==261){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==262){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==263){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==264){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==265){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==266){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==267){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==268){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==269){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==270){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==271){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==272){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==273){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==274){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==275){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==276){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==277){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==278){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==279){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==280){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==281){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==282){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==283){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==284){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==285){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==286){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==287){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==288){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==289){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==290){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==291){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==292){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==293){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==294){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==295){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==296){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==297){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==298){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==299){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==300){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==301){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==302){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==303){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==304){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==305){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==306){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==307){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==308){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==309){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==310){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==311){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==312){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==313){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==314){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==315){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==316){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==317){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==318){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==319){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==320){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==321){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==322){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==323){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==324){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==325){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==326){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==327){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==328){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==329){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==330){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==331){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==332){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==333){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==334){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==335){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==336){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==337){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==338){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==339){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==340){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==341){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==342){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==343){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==344){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==345){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==346){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==347){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==348){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==349){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==350){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==351){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==352){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==353){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==354){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==355){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==356){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==357){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==358){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==359){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==360){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==361){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==362){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==363){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==364){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==365){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==366){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==367){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==368){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==369){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==370){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==371){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==372){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==373){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==374){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==375){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==376){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==377){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==378){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==379){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==380){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==381){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==382){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==383){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==384){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==385){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==386){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==387){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==388){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==389){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==390){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==391){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==392){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==393){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==394){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==395){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==396){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==397){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==398){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==399){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==400){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==401){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==402){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==403){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==404){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==405){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==406){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==407){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==408){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==409){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==410){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==411){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==412){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==413){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==414){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==415){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==416){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==417){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==418){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }

        else if(pos==419){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==420){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==421){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==422){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==423){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==424){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==425){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==426){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==427){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==428){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }

        else if(pos==429){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==430){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==431){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==432){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==433){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==434){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==435){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==436){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==438){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==439){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==440){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==441){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==442){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==443){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==444){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==445){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==446){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==447){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==448){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==449){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==450){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==451){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==452){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==453){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==454){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==455){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==456){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==457){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==458){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==459){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }

        else if(pos==460){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==461){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==462){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==463){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==464){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==465){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==466){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==467){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==468){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==469) {
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==470){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==471){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==472){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==473){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==474){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==475){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==476){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==477){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==478){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==479){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }

        else if(pos==480){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==481){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==482){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==483){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==484){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==485){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==486){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==487){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==488){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==489){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==490){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==491){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==492){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==493){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==494){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==495){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==496){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==497){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==498){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }
        else if(pos==499){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }

        else if(pos==500){
            Viewdialog alert = new Viewdialog();
            alert.showDialog(this, "EXAMPLE: ");
        }




        text.setText("You clicked " + selectedItem + " at position " + position);

    }



 }

