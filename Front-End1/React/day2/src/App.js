import Header from "./component/header";
import Contents from "./component/contents";
import MainImg from "./component/mainimg";
import Footer from "./component/footer";
import Wrapper from "./component/wrapper";

function App() {
  return (
    <Wrapper>
      <Header />
      <MainImg />
      <Contents />
      <Footer />
    </Wrapper>
  );
}

export default App;
