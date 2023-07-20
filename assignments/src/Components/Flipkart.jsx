import abc from "./flipkart.module.css"

const Flipkart=()=>{
    return(
        <div>
            <section id={abc.nav}>
                <article>
                    <div className={abc.Logo}>
                        <ol>
                            <li><input type="text" placeholder="search for products, brands and more"/></li>
                            <li><a href=""><button>Login</button></a></li>
                            <li><a href="">Become a seller</a></li>
                            <li><a href="">More</a></li>
                            <li><a href="">Cart</a></li>
                            
                        </ol>
                    </div>
                    
                </article>
            </section>
            
            <section>

            <div className={abc.banner}>
                        <ol>
                            <li><a href="">Grocery</a></li>
                            <li><a href="">Mobile</a></li>
                            <li><a href="">Fashion</a></li>
                            <li><a href="">Electronics</a></li>
                            <li><a href="">Home</a></li>
                            <li><a href="">Appliance</a></li>
                            <li><a href="">Travel</a></li>
                            <li><a href="">Top offers</a></li>
                            <li><a href="">Beauty</a></li>
                            <li><a href="">Two wheelers</a></li>
                        </ol>
                    </div>
            </section>
        </div>
    )
}
export default Flipkart